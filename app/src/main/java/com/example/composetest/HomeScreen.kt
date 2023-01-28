package com.example.composetest

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavController
import com.example.composetest.model.Person

@Composable
fun HomeScreen(
    navController: NavController,
    sharedViewModel: SharedViewModel
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .clickable {
                val person = Person(firstName = "John", lastName = "Doe")
                sharedViewModel.addPerson(person)
                navController.navigate(Screen.Detail.route)
            },
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Home",
            color = MaterialTheme.colors.primary,
            fontSize = MaterialTheme.typography.h3.fontSize,
            fontWeight = FontWeight.Bold
        )
    }
}