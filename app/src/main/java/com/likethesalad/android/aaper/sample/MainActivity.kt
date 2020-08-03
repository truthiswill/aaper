package com.likethesalad.android.aaper.sample

import android.Manifest
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.likethesalad.android.aaper.api.EnsurePermissions
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txt.setOnClickListener {
            takePicture()
        }
    }

    @EnsurePermissions(permissions = [Manifest.permission.CAMERA])
    fun takePicture() {
        Toast.makeText(this, "Permissions granted", Toast.LENGTH_SHORT).show()
    }
}
