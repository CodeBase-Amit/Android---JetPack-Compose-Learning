package com.example.jetpackcomposelearning.`3_CoreComponents`

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview


//Filled Button

@Composable
fun FilledButtonSample(){
    val context = LocalContext.current


    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
//        Button(
//
//            onClick = {
//
//                Toast.makeText(context, "Button is clicked", Toast.LENGTH_SHORT).show()
//            }
//
//        ) {
//            Text(text = "Filled Button")
//        }

//        TONAL BUTTON

//        FilledTonalButton(
//            onClick = {
//                Toast.makeText(context, "Button is clicked", Toast.LENGTH_SHORT).show()
//            }
//        ) {
//            Text("Tonal Button")
//        }

//        OUTLINE BUTTON
//        OutlinedButton(
//            onClick = {
//
//            }
//        ) {
//            Text("Outlined Button")
//        }

//        ELEVATED BUTTON

//        ElevatedButton(
//            onClick = {
//
//            }
//        ) {
//            Text("Elevated Button")
//        }

//        TEXT BUTTON

//        TextButton(
//            onClick = {
//
//            }
//        ) {
//            Text("Text Button")
//        }
    }

}

//Tonal Button



@Preview(showSystemUi = true)
@Composable
fun FilledButtonSamplePreview(){
    FilledButtonSample()
}