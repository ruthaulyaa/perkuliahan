<!-- 11S20018
Ruth Aulya Silalahi -->

<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\WelcomeController;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

/*
=========
BAGIAN 1
=========
*/

// Routing to String
// =================
// Route::get('/', function () {
//     return 'Selamat Datang di Praktikum PABWE';
// });

// Routing Filename to String
// ==========================
// Route::get('modul', function () {
//     return 'Selamat Datang di Praktikum PABWE dengan alamat \'modul\' ';
// });

// Routing Filename/value to String
// ================================
// Route::get('modul/{materi}', function ($materi) {
//     return 'Selamat Datang di Praktikum ' .$materi. ' PABWE';
// });


/*
=========
BAGIAN 2
=========
*/

/*
ROUTE VERB
==========

Route::post('/', function(){
    //Handle someone sending a POST request to this route
});

Route::put('/', function(){
    //Handle someone sending a PUT request to this route
});

Route::delete('/', function(){
    //Handle someone sending a DELETE request to this route
});

Route::any('/', function(){
    //Handle any request to this route
});

Route::match('/', function(){
    //Handle GET or POST request to this route
});
*/

/*
=========
BAGIAN 4
=========
*/
// Route::get('welcome', [WelcomeController::class, 'index']);
// Route::get('modul/{materi}', function ($materi) {
//     return 'Selamat Datang di Praktikum ' .$materi. ' PABWE';
// });

/*
=========
BAGIAN 5
=========
*/
Route::get('/welcome/welcoming', function(){
    return view('welcoming');
});