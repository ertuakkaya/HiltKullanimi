package com.example.hiltkullanimi

import android.util.Log
import javax.inject.Inject

class Internet @Inject constructor (var adres : Adres) {


    fun basvuruYap(){
        Log.e("Basvuru : ","Basvuru ${adres.adresiBilgisi} adresine yapılıyor")
    }
}