package com.example.durga.sliding_tabs

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.jetbrains.anko.toast

/**
 * Created by durga on 6/3/18.
 */
class Schedule_tab : Fragment(){
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val tab2_fragment = inflater!!.inflate(R.layout.tab2_layout,container,false)
        return tab2_fragment
    }
}