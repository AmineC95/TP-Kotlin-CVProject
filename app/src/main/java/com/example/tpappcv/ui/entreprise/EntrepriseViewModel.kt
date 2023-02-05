package com.example.tpappcv.ui.entreprise

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.tpappcv.MyExperience

class EntrepriseViewModel : ViewModel() {

    private val _data = MutableLiveData<MyExperience>().apply {
        value = MyExperience("Eqiom", "Apprenti Developpeur")
    }
    val data: LiveData<MyExperience> = _data
}