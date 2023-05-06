package com.example.turbobrowser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val goButton=findViewById<Button>(R.id.goButton)
        val inputEditText=findViewById<EditText>(R.id.inputEditText)
        val webView=findViewById<WebView>(R.id.webView)
        webView.webViewClient= WebViewClient()
        goButton.setOnClickListener{
            webView.loadUrl(
                inputEditText.text.toString()
            )
        }
    }
}