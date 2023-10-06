package com.example.broadcastdemo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

//class CustomBroadcastReceiver:BroadcastReceiver() {
//    override fun onReceive(context: Context?, intent: Intent?) {
//        if ("com.example.broadcastdemo.EXAMPLE_ACTION"==intent?.action){
//            var receivedData=intent.getStringExtra("com.example.EXTRA_DATA").toString()
//            Log.d("Custom Receiver","Broadcast Received:${receivedData}")
//            Toast.makeText(context,"Broadcast Received:${receivedData}",Toast.LENGTH_LONG).show()
//        }
//    }
//}