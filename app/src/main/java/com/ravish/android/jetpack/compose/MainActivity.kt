package com.ravish.android.jetpack.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ravish.android.jetpack.compose.ui.theme.JetpackcomposegettingstartedTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackcomposegettingstartedTheme {
                AddCard(car = Car(R.drawable.car, name = "Bugatti"))
            }
        }
    }
}

@Composable
fun AddCard(car: Car) {
    // A surface container using the 'background' color from the theme
    Surface(color = MaterialTheme.colors.background) {
        Column(modifier = Modifier.fillMaxSize()) {
            TopAppBar(title = {
                Text("Cars")
            })
            CarCard(car = car)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackcomposegettingstartedTheme {
        AddCard(Car(R.drawable.car, name = "Bugatti"))
    }
}