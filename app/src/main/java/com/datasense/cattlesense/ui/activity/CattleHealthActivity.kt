package com.datasense.cattlesense.ui.activity

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.datasense.cattlesense.R
import com.datasense.cattlesense.databinding.ActivityCattleHealthBinding

class CattleHealthActivity : AppCompatActivity() {

  private lateinit var binding: ActivityCattleHealthBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityCattleHealthBinding.inflate(layoutInflater)
    setContentView(binding.root)
    supportActionBar?.setDisplayHomeAsUpEnabled(true)
    supportActionBar?.title = getString(R.string.cattle_health)

    initViews()
  }

  private fun initViews() {
    binding.vaccinationCard.setOnClickListener {
      startActivity(Intent(this, VaccinationActivity::class.java))
    }

    binding.diseasesCard.setOnClickListener {
      startActivity(Intent(this, DiseasesActivity::class.java))
    }

    binding.inseminationCard.setOnClickListener {
      startActivity(Intent(this, InseminationActivity::class.java))
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
