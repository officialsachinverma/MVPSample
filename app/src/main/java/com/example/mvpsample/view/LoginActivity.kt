package com.example.mvpsample.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mvpsample.R
import com.example.mvpsample.presenter.LoginPresenter
import kotlinx.android.synthetic.main.activity_main.*

class LoginActivity : AppCompatActivity(), ILoginView {

    private lateinit var loginPresenter: LoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginPresenter = LoginPresenter(this)

        bt_login.setOnClickListener {
            loginPresenter.onLoin(et_email.text.toString().trim(), et_password.text.toString().trim())
        }
    }

    override fun onLoginResult(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
