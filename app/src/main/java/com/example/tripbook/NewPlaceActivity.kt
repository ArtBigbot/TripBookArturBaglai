package com.example.tripbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class NewPlaceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_new_place)
    }
    companion object {
        const val EXTRA_REPLY = "com.example.android.placelistsql.REPLY"
    }
}
