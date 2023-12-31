package com.datasense.cattlesense.ui.activity

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.datasense.cattlesense.R
import com.datasense.cattlesense.databinding.ActivityFarmInfoBinding

class FarmInfoActivity : AppCompatActivity() {

  private lateinit var binding: ActivityFarmInfoBinding
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityFarmInfoBinding.inflate(layoutInflater)
    setContentView(binding.root)
    supportActionBar?.setDisplayHomeAsUpEnabled(true)
    supportActionBar?.title = getString(R.string.farm_info)

    initViews()
  }

  private fun initViews() {
    binding.addFarmInfoCard.setOnClickListener {
      startActivity(Intent(this, AddFarmInfoActivity::class.java))
    }

    binding.farmOverviewCard.setOnClickListener {
      startActivity(Intent(this, FarmOverviewActivity::class.java))
    }

    binding.expenseCard.setOnClickListener {
      startActivity(Intent(this, AddExpenseActivity::class.java))
    }

    binding.incomeCard.setOnClickListener {
      startActivity(Intent(this, AddIncomeActivity::class.java))
    }

    binding.farmInspectionCard.setOnClickListener {
      startActivity(Intent(this, FarmInspectionActivity::class.java))
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
