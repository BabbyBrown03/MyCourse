package com.example.mycourse

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mycourse.databinding.ItemMateriBinding

data class Materi(
    val judul: String,
    val deskripsi: String,
    val tanggal: String

)
class MateriAdapter(private val listMateri: List<Materi>,
    private val onItemClick: (Materi)-> Unit) :
    RecyclerView.Adapter<MateriAdapter.MateriViewHolder>() {

    inner class MateriViewHolder(private val binding: ItemMateriBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(materi: Materi) {
            binding.judul.text = materi.judul
            binding.deskripsi.text = materi.deskripsi
            binding.tanggal.text = materi.tanggal
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MateriViewHolder {
        val binding = ItemMateriBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MateriViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MateriViewHolder, position: Int) {
        holder.bind(listMateri[position])
    }

    override fun getItemCount(): Int = listMateri.size
}
