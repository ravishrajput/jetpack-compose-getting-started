package com.ravish.android.jetpack.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CarCard(car: Car) {
    Surface(shape = RoundedCornerShape(8.dp), elevation = 8.dp) {
        Column(modifier = Modifier.fillMaxWidth()) {
            val image = painterResource(car.imageResource)
            Image(
                image,
                "Car Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(144.dp)
            )
            Column(modifier =  Modifier.padding(16.dp)) {
                Text(car.name, style = MaterialTheme.typography.h4)
            }
        }
    }

}

@Composable
@Preview
fun DefaultCarCard() {
    CarCard(Car(R.drawable.car, name = "Bugatti"))
}