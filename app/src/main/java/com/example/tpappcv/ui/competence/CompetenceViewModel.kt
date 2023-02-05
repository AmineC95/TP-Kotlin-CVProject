package com.example.tpappcv.ui.competence

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CompetenceViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is competence Fragment"
    }
    val text: LiveData<String> = _text
}