package com.neppplus.pizzaorderapp_20211211.adepters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.neppplus.pizzaorderapp_20211211.R
import com.neppplus.pizzaorderapp_20211211.datas.StoreData

class StoreAdapter(
    val mContext : Context,
    val resID : Int,
    val mList : ArrayList<StoreData>
) : ArrayAdapter<StoreData>(mContext, resID, mList) {

    val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
          var tempRow = convertView
          if (tempRow == null){

              tempRow = mInflater.inflate(R.layout.store_list_item,null)

        }
        val row = tempRow!!

        val data = mList[position]
        val imgLogo = row.findViewById<ImageView>(R.id.imgLogo)
        val txtStoreName = row.findViewById<TextView>(R.id.txtStoreName)

        txtStoreName.text = data.name





         return row
     }
}