package com.example.mvpsample.view

interface ILoginView {
    fun onLoginSuccess(message: String)
    fun onLoginError(message: String)
}