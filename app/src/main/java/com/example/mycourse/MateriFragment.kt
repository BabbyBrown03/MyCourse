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
        Materi("APA AJA DAH","SESUAI KEYAKINAN","14 MARET 2006")
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