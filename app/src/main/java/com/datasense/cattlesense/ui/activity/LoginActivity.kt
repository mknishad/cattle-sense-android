package com.datasense.cattlesense.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.datasense.cattlesense.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

  private lateinit var binding: ActivityLoginBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityLoginBinding.inflate(layoutInflater)
    setContentView(binding.root)

    initViews()
  }

  private fun initViews() {
    binding.loginButton.setOnClickListener {
      startActivity(Intent(this, MainActivity::class.java))
      finish()
    }
  }
}
