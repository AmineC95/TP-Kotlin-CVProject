package com.example.tpappcv.ui.competence

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.tpappcv.MyData
import com.example.tpappcv.databinding.FragmentCompetenceBinding

class CompetenceFragment : Fragment() {

    private var _binding: FragmentCompetenceBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCompetenceBinding.inflate(inflater, container, false)
        binding.user = MyData("C# , Vue.js , Kotlin ...", "Communication-Perfectionnist ...")
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
