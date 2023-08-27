package com.datasense.cattlesense.ui.activity

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.datasense.cattlesense.R
import com.datasense.cattlesense.databinding.ActivityAddCattleBinding
import com.datasense.cattlesense.ui.fragment.MoreCattleInfoFragment

class AddCattleActivity : AppCompatActivity() {

  private lateinit var binding: ActivityAddCattleBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityAddCattleBinding.inflate(layoutInflater)
    setContentView(binding.root)
    supportActionBar?.setDisplayHomeAsUpEnabled(true)
    supportActionBar?.title = getString(R.string.add_cattle)
  }

  fun goToNext() {
    val transaction = supportFragmentManager.beginTransaction()
    transaction.replace(R.id.fragmentContainerView, MoreCattleInfoFragment.newInstance("", ""))
    transaction.addToBackStack(MoreCattleInfoFragment.TAG)
    transaction.commit()
  }

  override fun onOptionsItemSelected(item: MenuItem): Boolean {
    if (item.itemId == android.R.id.home) {
      onBackPressedDispatcher.onBackPressed()
      return true
    }
    return super.onOptionsItemSelected(item)
  }
}
