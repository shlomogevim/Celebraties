package com.example.celebraties

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class CelebratiesAdapter:BaseAdapter() {
    var celDatabase:CelebrtiesDataBase? = null

    constructor(){
        celDatabase=CelebrtiesDataBase()
    }

    override fun getView(position: Int, p1: View?, parants: ViewGroup?): View {
        

        val celebrity=celDatabase.celList?.get(position) ?:
        Celebrity("no actor","no discription",R.drawable.place_holder)


    }

    override fun getItem(p0: Int)=celDatabase.celList?.get(p0) ?:
      Celebrity("no actor","no discription",R.drawable.place_holder)


   /* override fun getItemId(p0: Int): Long {
    }*/

    override fun getCount()= celDatabase.celList?.size ?:0


}