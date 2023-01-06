package com.example.composetest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetest.ui.theme.ComposeTestTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterialApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTestTheme {
                // A surface container using the 'background' color from the theme
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MaterialTheme.colors.secondary)
                        .padding(24.dp)
                ) {
                    ExpandableCard(
                        title = "My Title",
                        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit." +
                                "Vestibulum pretium, sem ac pretium accumsan, nunc lectus" +
                                "convallis ipsum, et feugiat libero erat sit amet est." +
                                "Suspendisse tempor molestie tempor. Ut et arcu non sem dictum condimentum."
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
@ExperimentalMaterialApi
fun DefaultPreview() {
    ComposeTestTheme {
        ExpandableCard(
            title = "My Title",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit." +
                    "Vestibulum pretium, sem ac pretium accumsan, nunc lectus" +
                    "convallis ipsum, et feugiat libero erat sit amet est." +
                    "Suspendisse tempor molestie tempor. Ut et arcu non sem dictum condimentum."
        )
    }
}