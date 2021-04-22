package com.example.a24pix

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class ClaimActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_claim)
    }

    fun onClickNewPix(view: View) {
        Toast.makeText(this, "new pix in 00:00:00", Toast.LENGTH_LONG).show()
    }
}