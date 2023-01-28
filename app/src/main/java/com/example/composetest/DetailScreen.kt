package com.example.composetest

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavController

@Composable
fun DetailScreen(
    navController: NavController,
    sharedViewModel: SharedViewModel
) {
    val person = sharedViewModel.person
    LaunchedEffect(key1 = person) {
        person?.let { Log.d("DetailScreen", person.toString()) }
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            modifier = Modifier.clickable {
                navController.navigate(Screen.Home.route) {
                    popUpTo(Screen.Home.route) {
                        inclusive = true
                    }
                }
            },
            text = "Detail",
            color = Color.Red,
            fontSize = MaterialTheme.typography.h3.fontSize,
            fontWeight = FontWeight.Bold
        )
    }
}