package com.mo_husen.mad_pratical7_026

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import androidx.core.view.WindowCompat
import com.mo_husen.mad_pratical7_026.databinding.ActivityYouTubeBinding

class YouTubeActivity : AppCompatActivity() {
    private lateinit var binding : ActivityYouTubeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window,false)
        super.onCreate(savedInstanceState)
        binding=ActivityYouTubeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initYoutubePlayer()
        binding.btnSwitch.setOnClickListener{
            Intent(this,MainActivity::class.java).also{startActivity(it)}
        }
    }
    private val youtubeId="6stlCkUDG_s"

    private fun initYoutubePlayer(){
        val webSettings: WebSettings =binding.youtubeWebView.settings
        webSettings.javaScriptEnabled=true
        webSettings.loadWithOverviewMode=true
        webSettings.useWideViewPort=true
        binding.youtubeWebView.loadUrl("https://www.youtube.com/embed/$youtubeId")
    }
}