package com.example.tpappcv.ui.entreprise

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class EntrepriseViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is entreprise Fragment"
    }
    val text: LiveData<String> = _text
}