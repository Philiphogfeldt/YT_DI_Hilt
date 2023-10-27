package com.example.yt_di_hilt

import android.content.Context
import android.widget.Toast
import javax.inject.Inject

class TestClass @Inject constructor() {

    fun dummyFun(context: Context) {

        Toast.makeText(context, "Test hej 123", Toast.LENGTH_SHORT)
    }
}