package com.example.loginco

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.loginco.ui.theme.LoginCoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginCoTheme {
                Surface(
                    color = Color(234, 234, 247),
                    modifier = Modifier
                        .fillMaxHeight()
                ) {
                    Navigation()
                }
            }
        }
    }
}

