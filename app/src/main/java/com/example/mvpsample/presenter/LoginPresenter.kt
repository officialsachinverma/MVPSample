package com.example.mvpsample.presenter

import com.example.mvpsample.model.User
import com.example.mvpsample.view.ILoginView

class LoginPresenter(private val loginView: ILoginView) : ILoginPresenter {

    override fun onLoin(email: String, password: String) {
        val user = User(email, password)
        val isValid = user.isDataValid()

        if (isValid)
            loginView.onLoginResult("Login Successful")
        else
            loginView.onLoginResult("Login Failed")
    }

}