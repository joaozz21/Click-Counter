package com.generation.clickcounter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.generation.clickcounter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btCookie= binding.btCookie
        val number= binding.numberTxt
        var cont=0

        btCookie.setOnClickListener {
            cont++
            number.text= cont.toString()
        }



        supportActionBar!!.hide()
    }
}