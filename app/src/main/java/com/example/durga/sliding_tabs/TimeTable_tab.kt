package com.example.durga.sliding_tabs

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import org.jetbrains.anko.toast


/**
 * Created by durga on 6/3/18.
 */
class TimeTable_tab : Fragment(){

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val tab1_fragment = inflater!!.inflate(R.layout.tab1_layout,container,false)
        return tab1_fragment

    }

}