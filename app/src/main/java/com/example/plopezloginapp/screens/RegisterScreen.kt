package com.example.plopezloginapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.plopezloginapp.components.cInput
import com.example.plopezloginapp.ui.theme.BackgroundColor

@Composable
fun RegisterScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 25.dp)
                .background(Color.Black),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Sign Up",
                fontSize = 24.sp,
                style = MaterialTheme.typography.labelLarge,
                fontWeight = FontWeight.W400,
                color = Color.White,
            )
        }

        // Panel inferior
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.90f)
                .align(Alignment.BottomCenter)
                .clip(RoundedCornerShape(topStart = 80.dp))
                .background(BackgroundColor)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(50.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                cInput(TextTop = "First name", TextBottom = "Enter your first name")
                cInput(TextTop = "Last name", TextBottom = "Enter your last name")
                cInput(TextTop = "Email", TextBottom = "Enter your e-mail")
                cInput(TextTop = "Password", TextBottom = "Enter your password", isPassword = true)
                cInput(TextTop = "Confirm password", TextBottom = "Confirm your password", isPassword = true)

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp)
                        .clip(RoundedCornerShape(topStart = 20.dp, bottomStart = 20.dp, bottomEnd = 20.dp))
                        .background(Color.Black),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        modifier = Modifier.padding(15.dp),
                        text = "Sign Up",
                        color = Color.White
                    )
                }

                Spacer(modifier = Modifier.weight(1f))

                // Navegar a LoginScreen
                Text(
                    text = "Already have any account? Sign In",
                    fontWeight = FontWeight.W400,
                    color = Color.Black,
                    modifier = Modifier.clickable {
                        navController.navigate(LoginScreenRoute) {
                            launchSingleTop = true
                            popUpTo(navController.graph.startDestinationId) { saveState = true }
                            restoreState = true
                        }
                    }
                )
            }
        }
    }
}