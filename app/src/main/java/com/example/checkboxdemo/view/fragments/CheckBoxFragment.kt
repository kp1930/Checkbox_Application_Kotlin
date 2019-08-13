package com.example.checkboxdemo.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.checkboxdemo.models.Model
import com.example.checkboxdemo.R
import com.example.checkboxdemo.view.adapters.Adapter

class CheckBoxFragment(private val string: String, private val max: Int) : Fragment() {

    private var checkList: ArrayList<Model>? = null
    private var recyclerView: RecyclerView? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_check_box, container, false)

        checkList = ArrayList()
        val checkBox = arrayOf(Model(), Model(), Model(), Model(), Model())

        for (i in 0..max) {
            checkBox[i].value = "$string${i + 1}"
            checkList?.add(checkBox[i])
        }

        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView?.setHasFixedSize(true)
        val checkBoxItem = Adapter(checkList!!)
        recyclerView?.adapter = checkBoxItem

        return view
    }
}