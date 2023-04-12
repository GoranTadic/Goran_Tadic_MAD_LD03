package com.example.goran_tadic_mad_ld3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.example.goran_tadic_mad_ld3.ui.theme.navigation.MovieNavigation
import com.example.goran_tadic_mad_ld3.ui.theme.MovieAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MovieAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MovieNavigation()
                }
            }
        }
    }
}
