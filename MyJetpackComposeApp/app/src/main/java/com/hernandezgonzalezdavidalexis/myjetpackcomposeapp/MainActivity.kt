package com.hernandezgonzalezdavidalexis.myjetpackcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            HolaMundo()
        }
    }
}

@Composable
fun HolaMundo() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Hola Mundo",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "Nombre: David Alexis Hernandez Gonzalez",
            fontSize = 20.sp,
            modifier = Modifier.padding(top = 20.dp)
        )

        Text(
            text = "Boleta: 2024630227",
            fontSize = 20.sp,
            modifier = Modifier.padding(top = 10.dp)
        )

        Text(
            text = "Grupo: 7CV4",
            fontSize = 20.sp,
            modifier = Modifier.padding(top = 10.dp)
        )
    }
}