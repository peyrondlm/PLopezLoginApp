package com.example.plopezloginapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun cInput(TextTop: String, TextBottom: String) {
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 10.dp, bottom = 10.dp)
            .clip(RoundedCornerShape(topStart = 20.dp, bottomStart = 20.dp, bottomEnd = 20.dp))
            .background(Color.White)
            .padding(20.dp)
    ){
        Column {
            Text(
                text = TextTop,
                fontWeight = FontWeight.W400
            )
            Text(
                text = TextBottom,
                color = Color.Gray
            )
        }
    }
}