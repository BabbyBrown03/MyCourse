package com.example.mycourse

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mycourse.databinding.FragmentMateriBinding

class MateriFragment : Fragment() {

    private var _binding: FragmentMateriBinding? = null
    private val binding get() = _binding!!

    private lateinit var adapter: MateriAdapter

    private val materiList = listOf(
        Materi("Pengenalan Android", "Dasar-dasar Android Studio dan struktur project", "14 Maret 2006"),
        Materi("Activity dan Lifecycle", "Membahas siklus hidup Activity", "20 Mei 2008"),
        Materi("Intent dan Navigasi", "Cara berpindah antar Activity menggunakan Intent", "12 Januari 2010"),
        Materi("RecyclerView", "Menampilkan list data secara efisien", "7 Juli 2012"),
        Materi("Fragment", "Membuat UI modular dengan Fragment", "18 September 2014"),
        Materi("View Binding & Data Binding", "Menghubungkan UI dengan data lebih mudah", "25 Februari 2016"),
        Materi("Room Database", "Penyimpanan data lokal dengan Room", "3 November 2017"),
        Materi("Retrofit", "Mengambil data dari API menggunakan Retrofit", "9 April 2019"),
        Materi("MVVM Architecture", "Penerapan arsitektur MVVM di Android", "15 Agustus 2021"),
        Materi("Jetpack Compose", "Membuat UI modern deklaratif dengan Compose", "1 Januari 2023")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMateriBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = MateriAdapter(materiList){ materi ->
            Toast.makeText(requireContext(), "${materi.judul}", Toast.LENGTH_SHORT).show()
        }
        binding.recyclerViewMateri.layoutManager = LinearLayoutManager(context)
        binding.recyclerViewMateri.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}