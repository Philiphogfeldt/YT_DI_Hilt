package com.example.yt_di_hilt

import android.content.Context
import android.widget.Toast
import javax.inject.Inject

class TestClass @Inject constructor(var constructorInjection: ConstructorInjection) {

    fun dummyFun(context: Context) {

        constructorInjection.showToast(context)
        //Denna använde jag innan med funktion
        // Men nu tar jag den via min constructor istället och injectar.


        //Toast.makeText(context, "Test hej 123", Toast.LENGTH_SHORT)
    }
}