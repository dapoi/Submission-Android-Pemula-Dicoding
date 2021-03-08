package com.daffa.yourmath

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityBio : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bio)
        val suppBack: Button = findViewById(R.id.suppBack)
        suppBack.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.suppBack -> {
                val callBack = Intent(this, MainActivity::class.java)
                startActivity(callBack)
            }
        }
    }
}