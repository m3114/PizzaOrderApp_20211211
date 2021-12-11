package com.neppplus.pizzaorderapp_20211211.fragment

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.neppplus.pizzaorderapp_20211211.EditNicknameActivity
import com.neppplus.pizzaorderapp_20211211.R
import kotlinx.android.synthetic.main.fragment_my_profile.*

class MyProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_profile,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btnEditNickname.setOnClickListener{
            val myIntent = Intent(requireContext(), EditNicknameActivity::class.java)
           startActivityForResult(myIntent.REQ_FOR_NICKNAME)

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQ_FOR_NICKNAME){
            if (requestCode == Activity.RESULT_OK)
                val nickname = data!!.getStringExtra("nick")

            txtNickname.text = nickname
        }
    }

}
