package com.hemendra.fragmentskotlin

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_chats.*

class ChatFragment :Fragment()
{

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view :View = inflater.inflate(R.layout.fragment_chats,container,false)
       var adaper = ArrayAdapter<String>(context!!,android.R.layout.simple_list_item_1, arrayOf("Hemendra","Swathi","Srini","lalith"))

        var listview=view.findViewById<ListView>(R.id.lv)
        listview.adapter = adaper
        return view
    }




}