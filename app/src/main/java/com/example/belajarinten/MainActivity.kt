package com.example.belajarinten

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.belajarinten.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        explicit()
        implicit()

    }

    fun explicit() {
        val pesan = binding.edExplicit.text.toString()
        binding.btnExplicit.setOnClickListener {
            val intenExplicit = Intent(this@MainActivity, SecondActivity::class.java)
            intenExplicit.putExtra("nama", pesan)
            startActivity(intenExplicit)
        }
    }

    fun implicit() {
        binding.btnImplicit.setOnClickListener {
            val url = binding.edImplicit.text.toString()
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
    }
}
