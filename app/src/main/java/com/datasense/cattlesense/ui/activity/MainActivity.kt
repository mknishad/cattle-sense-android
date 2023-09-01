package com.datasense.cattlesense.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.datasense.cattlesense.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

  private lateinit var binding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    initViews()
  }

  private fun initViews() {
    binding.farmInfoCard.setOnClickListener {
      startActivity(Intent(this, FarmInfoActivity::class.java))
    }

    binding.cattleInfoCard.setOnClickListener {
      startActivity(Intent(this, CattleInfoActivity::class.java))
    }

    binding.cattleHealthCard.setOnClickListener {
      startActivity(Intent(this, CattleHealthActivity::class.java))
    }

    binding.searchCattleCard.setOnClickListener {

    }
  }
}
