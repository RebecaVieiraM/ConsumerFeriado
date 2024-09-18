package com.example.consumerferiado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val feriadoApi= RetrofitHelper.getInstance().create(FeriadoApi::class.java)
        // iniciando uma nova coroutine
        MainScope().launch{
            val result= feriadoApi.getFeriados()
            if(result != null)
                Log.d("Retorno da API: ", result.body().toString())
        }
    }
}