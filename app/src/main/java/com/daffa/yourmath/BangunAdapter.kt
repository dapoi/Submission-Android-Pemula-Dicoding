package com.daffa.yourmath

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class BangunAdapter(private val listBangun: ArrayList<Bangun>) : RecyclerView.Adapter<BangunAdapter.BangunViewHolder>() {
    class BangunViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvNama: TextView = itemView.findViewById(R.id.nama_item)
        var tvDetil: TextView = itemView.findViewById(R.id.item_detil)
        var gambar: ImageView = itemView.findViewById(R.id.img_item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BangunAdapter.BangunViewHolder {
        val view: View =LayoutInflater.from(parent.context).inflate(R.layout.item_bangun, parent, false)
        return BangunViewHolder(view)
    }

    override fun onBindViewHolder(holder: BangunAdapter.BangunViewHolder, position: Int) {
        var (nama, nRumus, rumus, detil, foto) = listBangun[position]
        Glide.with(holder.itemView.context)
                .load(foto)
                .apply(RequestOptions())
                .into(holder.gambar)
        holder.tvNama.text = nama
        holder.tvDetil.text = detil

        val dataDetil = holder.itemView.context
        holder.itemView.setOnClickListener {
            val pindahDataDetil = Intent(dataDetil, BangunDetail::class.java)
            pindahDataDetil.putExtra(BangunDetail.EXTRA_FOTO, foto)
            pindahDataDetil.putExtra(BangunDetail.EXTRA_NAMA_RUMUS, nRumus)
            pindahDataDetil.putExtra(BangunDetail.EXTRA_NAMA, nama)
            pindahDataDetil.putExtra(BangunDetail.EXTRA_RUMUS, rumus)
            pindahDataDetil.putExtra(BangunDetail.EXTRA_DETIL, detil)
            dataDetil.startActivity(pindahDataDetil)
        }
    }

    override fun getItemCount(): Int {
        return listBangun.size
    }

}