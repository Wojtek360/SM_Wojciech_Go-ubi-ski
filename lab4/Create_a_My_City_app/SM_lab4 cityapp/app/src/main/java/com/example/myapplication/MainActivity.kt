package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.ui.theme.MonumentsScreen
import com.example.myapplication.ui.theme.RomeNavHost
import com.example.myapplication.viewmodel.RomeViewModel

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel = RomeViewModel()

        setContent {
            MaterialTheme {
                val navController = rememberNavController()
                RomeNavHost(navController, viewModel)
            }
        }
    }
}
