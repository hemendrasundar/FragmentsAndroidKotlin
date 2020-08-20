package com.hemendra.fragmentskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {
   lateinit var fragmentmanager:FragmentManager
   lateinit var  ftx:FragmentTransaction
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fragmentmanager= supportFragmentManager
        ftx = fragmentmanager.beginTransaction()
        ftx.add(R.id.fragment_layout,ChatFragment())
        ftx.commit()

        Calls_btn.setOnClickListener(this)
        chat_btn.setOnClickListener(this)
        Status_btn.setOnClickListener(this)


    }

    override fun onClick(view: View?) {
        fragmentmanager = supportFragmentManager
        ftx = fragmentmanager.beginTransaction()

        when(view!!.id)
        {
            R.id.Calls_btn ->  ftx.replace(R.id.fragment_layout,CallsFragment())
            R.id.Status_btn -> ftx.replace(R.id.fragment_layout,StatusFragment())
            R.id.chat_btn -> ftx.replace(R.id.fragment_layout,ChatFragment())

        }
        ftx.commit()

    }


}