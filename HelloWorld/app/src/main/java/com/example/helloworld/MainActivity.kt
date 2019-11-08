package com.example.helloworld

import android.content.Context
import android.location.LocationManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.text = "nee"
        button1.setOnClickListener() {
            progressBar1.setProgress(progressBar1.getProgress() + 1)
        }
        progressBar1.setOnClickListener() {
            progressBar1.setProgress(0)
        }

        val locationManager = getSystemService(Context.LOCATION_SERVICE) as LocationManager


        val smsManager = SmsManager.getDefault() as SmsManager
        smsManager.sendTextMessage("+3124649381", null, "smart mobile", null, null)
    }

}

