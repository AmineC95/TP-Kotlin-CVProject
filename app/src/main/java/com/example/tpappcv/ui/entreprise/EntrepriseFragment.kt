package com.example.tpappcv.ui.entreprise

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.tpappcv.databinding.FragmentEntrepriseBinding

class EntrepriseFragment : Fragment() {

    private var _binding: FragmentEntrepriseBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val entrepriseViewModel =
            ViewModelProvider(this).get(EntrepriseViewModel::class.java)

        _binding = FragmentEntrepriseBinding.inflate(inflater, container, false)
        val root: View = binding.root

        entrepriseViewModel.data.observe(viewLifecycleOwner, Observer {
            binding.textEntreprise.text = "${it.company} - ${it.job}"
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
