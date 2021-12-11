package com.neppplus.pizzaorderapp_20211211.adepters

import android.content.Context
import android.widget.ArrayAdapter
import com.neppplus.pizzaorderapp_20211211.datas.StoreData

class StoreAdapter(
    val mContext : Context,
    val resID : Int,
    val mList : ArrayList<StoreData>
) : ArrayAdapter<StoreData>(mContext, resID, mList) {
}