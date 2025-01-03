<?php

namespace App\Http\Controllers;

use App\Utils\Tools;
use Illuminate\Http\Request;

class HomeController extends Controller
{

    public function index(Request $request){

        $auth = Tools::getAuth($request);

        $data = [
            'auth' => $auth
        ];

        return view('welcome', $data);
    }

}
