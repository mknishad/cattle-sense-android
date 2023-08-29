package com.datasense.cattlesense.ui.activity

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.datasense.cattlesense.R
import com.datasense.cattlesense.databinding.ActivityCattleListBinding

class CattleListActivity : AppCompatActivity() {

  private lateinit var binding: ActivityCattleListBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityCattleListBinding.inflate(layoutInflater)
    setContentView(binding.root)
    supportActionBar?.setDisplayHomeAsUpEnabled(true)
    supportActionBar?.title = getString(R.string.cattle_list)
  }

  override fun onOptionsItemSelected(item: MenuItem): Boolean {
    if (item.itemId == android.R.id.home) {
      finish()
      return true
    }
    return super.onOptionsItemSelected(item)
  }
}
