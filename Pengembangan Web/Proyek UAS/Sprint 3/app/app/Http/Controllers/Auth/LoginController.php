<?php

namespace App\Http\Controllers\Auth;

use App\Http\Controllers\Controller;
use App\Utils\Tools;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Http;

class LoginController extends Controller
{

    public function get(){
        return view('auth.login');
    }

    public function post(Request $request){

        $this->validate($request, [
            'username' => ['required'],
            'password' => ['required']
        ]);

        $parseData = null;
        try {

            $response = Http::asForm()->post(env("API_CIS") . "/jwt-api/do-auth", [
                'username' => $request->username,
                'password' => $request->password
            ]);
            $parseData = json_decode($response->body());

            if(! $parseData->result){
                return back()->with('error', $parseData->message);
            }

            Tools::setAuth($request, $parseData->user);
            Tools::setToken($request, $parseData->token);
            Tools::setTokenRefresh($request, $parseData->refresh_token);

        }catch (\Exception $err){
            // Gagal terhubung dengan API CIS
            return back()->with('error', Tools::errorMessage(100));
        }

        return redirect()->route("home");

    }

    public function  logout(Request $request){

        Tools::setTokenRefresh($request, "");
        Tools::setToken($request, "");
        Tools::setAuth($request, "");
        return redirect()->route("login.get");

    }

}
