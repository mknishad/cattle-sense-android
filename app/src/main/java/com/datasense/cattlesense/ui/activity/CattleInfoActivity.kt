package com.datasense.cattlesense.ui.activity

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.datasense.cattlesense.R
import com.datasense.cattlesense.databinding.ActivityCattleInfoBinding

class CattleInfoActivity : AppCompatActivity() {

  private lateinit var binding: ActivityCattleInfoBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityCattleInfoBinding.inflate(layoutInflater)
    setContentView(binding.root)
    supportActionBar?.setDisplayHomeAsUpEnabled(true)
    supportActionBar?.title = getString(R.string.cattle_info)

    initViews()
  }

  private fun initViews() {
    binding.addNewCattleLayout.setOnClickListener {
      startActivity(Intent(this, AddCattleActivity::class.java))
    }

    binding.milkProductionLayout.setOnClickListener {
      startActivity(Intent(this, MilkProductionActivity::class.java))
    }

    binding.weightTrackerLayout.setOnClickListener {
      startActivity(Intent(this, WeightTrackerActivity::class.java))
    }

    binding.deathRecordLayout.setOnClickListener {
      startActivity(Intent(this, DeathRecordActivity::class.java))
    }

    binding.heatNotificationLayout.setOnClickListener {
      startActivity(Intent(this, HeatInfoActivity::class.java))
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
