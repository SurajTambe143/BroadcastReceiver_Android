package com.example.broadcastdemo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private val br=BroadcastExample()
    private val cbr=CustomBroadcastReceiver()
    private var displayText:TextView? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intentFilter=IntentFilter()

        displayText=findViewById(R.id.set_text)

        intentFilter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED)
        intentFilter.addAction(Intent.ACTION_HEADSET_PLUG)
        registerReceiver(br,intentFilter)

        val intentF=IntentFilter("com.example.broadcastdemo.TEXT_SEND_ACTION")
        registerReceiver(cbr,intentF)

    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(br)
        unregisterReceiver(cbr)
    }

    inner class CustomBroadcastReceiver: BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            if ("com.example.broadcastdemo.TEXT_SEND_ACTION"==intent?.action){
                var receivedData=intent.getStringExtra("com.example.EXTRA_DATA").toString()
                displayText?.text= receivedData
                Log.d("Custom Receiver","Broadcast Received:${receivedData}")
                Toast.makeText(context,"Broadcast Received:${receivedData}", Toast.LENGTH_LONG).show()
            }
        }
    }
}