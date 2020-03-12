package com.example.mvpsample.presenter

import com.example.mvpsample.model.User
import com.example.mvpsample.view.ILoginView

class LoginPresenter(private val loginView: ILoginView) : ILoginPresenter {

    override fun onLoin(email: String, password: String) {
        val user = User(email, password)

        when(user.isDataValid()) {
            0 -> loginView.onLoginError("Please enter email id")
            1 -> loginView.onLoginError("Incorrect email id")
            2 -> loginView.onLoginError("Password should be greater then 6 character")
            else -> loginView.onLoginSuccess("Login Successful")
        }
    }

}