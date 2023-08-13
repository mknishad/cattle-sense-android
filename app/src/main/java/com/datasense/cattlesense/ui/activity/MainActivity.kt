package com.datasense.cattlesense.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.datasense.cattlesense.R
import com.datasense.cattlesense.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

  private lateinit var binding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)
    supportActionBar?.setDisplayHomeAsUpEnabled(true)

    initViews()
  }

  private fun initViews() {
    binding.farmInfoLayout.setOnClickListener {
      startActivity(Intent(this, FarmInfoActivity::class.java))
    }

    binding.cattleInfoLayout.setOnClickListener {
      startActivity(Intent(this, CattleInfoActivity::class.java))
    }

    binding.cattleHealthLayout.setOnClickListener {

    }

    binding.searchCattleLayout.setOnClickListener {

    }
  }

  override fun onOptionsItemSelected(item: MenuItem): Boolean {
    if (item.itemId == android.R.id.home) {
      finish()
      return true
    }
    return super.onOptionsItemSelected(item)
  }
}
