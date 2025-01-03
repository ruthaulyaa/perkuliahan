<!-- 11S20018
Ruth Aulya Silalahi -->

<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class WelcomeController extends Controller
{
    //fungsi index ini dibuat sendiri
    public function index(){
        return 'ini adalah halaman index welcoming';
    }
}
