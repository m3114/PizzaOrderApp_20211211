package com.neppplus.pizzaorderapp_20211211

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.neppplus.pizzaorderapp_20211211.datas.StoreData
import kotlinx.android.synthetic.main.activity_view_store_detali.*

class ViewStoreDetaliActivity : AppCompatActivity() {

    lateinit var mStoreData : StoreData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store_detali)
        setupEvents()
        setValues()
    }
    fun setupEvents(){

    }
    fun setValues(){
        mStoreData = intent.getSerializableExtra("store") as StoreData
        txtStoreName.text = mStoreData.name
        txtPhoneNum.text = mStoreData.phone

        Glide.with(this).load(mStoreData.logoURL).into(imgLogo)

    }
}