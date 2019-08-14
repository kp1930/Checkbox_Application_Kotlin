package com.example.checkboxdemo.view.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.checkboxdemo.models.Model
import com.example.checkboxdemo.R

/**
 * Created by Kush Pandya on 8/9/2019.
 */
class Adapter(private val checkList: ArrayList<Model>) : RecyclerView.Adapter<Adapter.CheckBoxHolder>() {

    companion object {
        val array = mutableListOf<String>()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CheckBoxHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list_checkbox, parent, false)
        return CheckBoxHolder(view)
    }

    override fun onBindViewHolder(holder: CheckBoxHolder, position: Int) {
        holder.checkBox?.text = checkList[position].value

        holder.checkBox?.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                checkList[position].checked = true
                array.add(checkList[position].value.toString())
            }
            if (!b) {
                checkList[position].checked = false
                array.remove(checkList[position].value.toString())
            }
        }
    }

    override fun getItemCount(): Int {
        return checkList.size
    }

    inner class CheckBoxHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var checkBox: android.widget.CheckBox? = null

        init {
            checkBox = itemView.findViewById(R.id.checkbox)
        }
    }
}