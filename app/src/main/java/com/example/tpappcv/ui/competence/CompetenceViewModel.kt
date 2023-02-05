package com.example.tpappcv.ui.competence

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.tpappcv.MyData

class CompetenceViewModel : ViewModel() {

    private val _data = MutableLiveData<MyData>().apply {
        value = MyData("CHIOUKH Amine", "amine.chioukh95@gmail.com")
    }
    val data: LiveData<MyData> = _data
}
