package com.example.mvpsample.model

import android.text.TextUtils
import android.util.Patterns
import java.util.regex.Pattern

class User(private val email: String, private val password: String): IUser {

    override fun isDataValid(): Int = when {
        TextUtils.isEmpty(email) -> 0
        !Patterns.EMAIL_ADDRESS.matcher(email).matches() -> 1
        password.length < 6 -> 2
        else -> -1
    }

}