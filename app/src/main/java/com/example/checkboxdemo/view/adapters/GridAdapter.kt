package com.example.checkboxdemo.view.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.core.view.setPadding

/**
 * Created by Kush Pandya on 8/13/2019.
 */
class GridAdapter(val string: MutableList<String>, private val context: Context) : BaseAdapter() {

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val textView: TextView
        if (p1 == null) {
            textView = TextView(context)
            textView.text = string[p0]
            textView.setPadding(16)
            textView.textSize = 22f
        }
        else
            textView = p1 as TextView
        return textView
    }

    override fun getItem(p0: Int): Any {
        return string[p0]
    }

    override fun getItemId(p0: Int): Long {
        return string.indexOf(getItem(p0)).toLong()
    }

    override fun getCount(): Int {
        return string.size
    }
}