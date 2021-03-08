 package com.daffa.yourmath

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class BangunDetail : AppCompatActivity() {
    companion object {
        const val EXTRA_NAMA = "extra_nama"
        const val EXTRA_NAMA_RUMUS = "extra_nama_rumus"
        const val EXTRA_RUMUS = "extra_rumus"
        const val EXTRA_DETIL = "extra_detil"
        const val EXTRA_FOTO = "extra_foto"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_bangun_detail)
        val actionBar = supportActionBar
        actionBar!!.title = "Penjelasan"


        val namaBangun = findViewById<TextView>(R.id.judul_detil)
        val namaRumus = findViewById<TextView>(R.id.judul_rumus)
        val rumusDetil = findViewById<TextView>(R.id.rumus_detil)
        val penjelasan = findViewById<TextView>(R.id.penjelasan)
        val fotoDetil = findViewById<ImageView>(R.id.foto_detil)

        val nama = intent.getStringExtra(EXTRA_NAMA)
        val nRumus = intent.getStringExtra(EXTRA_NAMA_RUMUS)
        val rumus = intent.getStringExtra(EXTRA_RUMUS)
        val detil = intent.getStringExtra(EXTRA_DETIL)
        val foto = intent.getIntExtra(EXTRA_FOTO, 0)

        namaBangun.text = nama
        namaRumus.text = nRumus
        rumusDetil.text = rumus
        penjelasan.text = detil
        Glide.with(this)
            .load(foto)
            .apply(RequestOptions())
            .into(fotoDetil)
    }
}