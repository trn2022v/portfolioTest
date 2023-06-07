package com.example.myapplication.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class HomeViewModel : ViewModel() {


    private val _text = MutableLiveData<String>().apply {
        val date = SimpleDateFormat("dd MMM, yyyy", Locale.getDefault()).format(Date())
        value = date
    }

    val text: LiveData<String> = _text
}