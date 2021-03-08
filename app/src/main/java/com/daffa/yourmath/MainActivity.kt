package com.daffa.yourmath

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toolbar
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var rvBangun: RecyclerView
    private var list: ArrayList<Bangun> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvBangun = findViewById(R.id.rv_rumus)
        rvBangun.setHasFixedSize(true)

        list.addAll(BangunData.listData)
        showRecycleList()

        // inisialisasi button
        val supportButon: Button = findViewById(R.id.suppButton)
        supportButon.setOnClickListener(this)
    }

    private fun showRecycleList() {
        rvBangun.layoutManager = LinearLayoutManager(this)
        val bangunAdapter = BangunAdapter(list)
        rvBangun.adapter = bangunAdapter
    }

        // fungsi button
    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.suppButton -> {
                val callSupp = Intent(this, ActivityBio::class.java )
                startActivity(callSupp)
            }
        }
    }
}