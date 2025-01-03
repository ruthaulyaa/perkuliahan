<?php

use App\Http\Controllers\Auth\LoginController;
use App\Http\Controllers\HomeController;
use Illuminate\Support\Facades\Route;


Route::group(['middleware' => ['check.token']] , function() {
    Route::get('/', [HomeController::class, 'index'])->name('home');
});

Route::get('login', [LoginController::class, 'get'])->name('login.get');
Route::post('login', [LoginController::class, 'post'])->name('login.post');
Route::get('logout', [LoginController::class, 'logout'])->name('logout.get');
