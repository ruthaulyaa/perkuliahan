<?php

namespace App\Http\Middleware;

use App\Utils\Tools;
use Closure;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Http;

class CheckToken
{
    /**
     * Handle an incoming request.
     *
     * @param  \Illuminate\Http\Request  $request
     * @param  \Closure(\Illuminate\Http\Request): (\Illuminate\Http\Response|\Illuminate\Http\RedirectResponse)  $next
     * @return \Illuminate\Http\Response|\Illuminate\Http\RedirectResponse
     */
    public function handle(Request $request, Closure $next)
    {
        $token = Tools::getToken($request);
        if(! $token){
            return redirect()->route("logout.get");
        }

        $auth = Tools::getAuth($request);
        if(! $auth){
            return redirect()->route("logout.get");
        }

        $refresh_token = Tools::getTokenRefresh($request);
        if(! $refresh_token){
            return redirect()->route("logout.get");
        }


        $uid = Tools::getUserIdFromToken($token);
        if($uid <= 0 || !isset($auth->user_id) || ($auth->user_id != $uid)){
            return redirect()->route("logout.get");
        }

        try {
            $response = Http::asForm()->withToken($token)->post(env("API_CIS") . "/jwt-api/new-access-token", [
                'refresh_token' => $refresh_token
            ]);
            $parseData = json_decode($response->body());
            if((isset($parseData->result) && !$parseData->result) || ! isset($parseData->token)){
                return redirect()->route("logout.get");
            }
            Tools::setToken($request, $parseData->token);
        }catch (\Exception $ex){
            return redirect()->route("logout.get");
        }

        return $next($request);
    }
}
