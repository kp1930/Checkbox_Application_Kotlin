package com.example.checkboxdemo.view.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import com.example.checkboxdemo.R
import com.example.checkboxdemo.view.adapters.Adapter
import com.example.checkboxdemo.view.adapters.GridAdapter
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        supportActionBar?.title = "GridView"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        if (Adapter.array.isEmpty()) {
            textView.visibility = View.VISIBLE
        }
        else {
            textView.visibility = View.GONE
            gridView.adapter = GridAdapter(Adapter.array, this@SecondActivity)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            onBackPressed()
            return true
        }
        return false
    }
}