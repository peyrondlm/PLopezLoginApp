package com.example.plopezloginapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.plopezloginapp.screens.LoginScreen
import com.example.plopezloginapp.screens.LoginScreenRoute
import com.example.plopezloginapp.screens.RegisterScreen
import com.example.plopezloginapp.screens.RegisterScreenRoute
import com.example.plopezloginapp.ui.theme.PLopezLoginAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PLopezLoginAppTheme {
                val navController = rememberNavController()
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    NavHost(
                        navController = navController,
                        startDestination = LoginScreenRoute
                    ) {
                        composable<LoginScreenRoute> {
                            LoginScreen(navController = navController)
                        }

                        composable<RegisterScreenRoute> {
                            RegisterScreen(navController = navController)
                        }
                    }
                }
            }
        }
    }
}