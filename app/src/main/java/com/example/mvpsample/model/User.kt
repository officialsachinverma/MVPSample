package com.example.mvpsample.model

import android.text.TextUtils
import android.util.Patterns
import java.util.regex.Pattern

class User(private val email: String, private val password: String): IUser {

//    override fun getEmail(): String {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
//
//    override fun getPassword(): String {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }

    override fun isDataValid(): Boolean {
        return !TextUtils.isEmpty(email)
                && Patterns.EMAIL_ADDRESS.matcher(email).matches()
                && password.length > 6
    }

}