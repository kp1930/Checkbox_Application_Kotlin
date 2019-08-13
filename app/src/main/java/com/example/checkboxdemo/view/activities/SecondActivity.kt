package com.example.checkboxdemo.view.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.checkboxdemo.R
import com.example.checkboxdemo.view.adapters.Adapter
import com.example.checkboxdemo.view.adapters.GridAdapter
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        gridView.adapter = GridAdapter(Adapter.array, this@SecondActivity)
    }
}