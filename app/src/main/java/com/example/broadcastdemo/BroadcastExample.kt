package com.example.broadcastdemo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class BroadcastExample: BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        if (Intent.ACTION_LOCKED_BOOT_COMPLETED == (intent?.action)){
            Toast.makeText(context,"Boot Completed",Toast.LENGTH_LONG).show()
            Log.d("Broadcast example","Boot Completed")
        }
        if (Intent.ACTION_AIRPLANE_MODE_CHANGED==(intent?.action)){
            Toast.makeText(context,"Aeroplane Mode Change",Toast.LENGTH_LONG).show()
            Log.d("Broadcast example","Aeroplane mode Change")
        }
        if (Intent.ACTION_HEADSET_PLUG==(intent?.action)){
            Toast.makeText(context,"Headset Change",Toast.LENGTH_LONG).show()
            Log.d("Broadcast example","Headset Change")
        }
    }
}