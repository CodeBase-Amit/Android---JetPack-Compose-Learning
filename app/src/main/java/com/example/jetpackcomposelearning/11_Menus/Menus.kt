package com.example.jetpackcomposelearning.`11_Menus`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DropDownMenuExample() {

    var expanded by remember {
        mutableStateOf(false)
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopEnd
    ){
        Box(
            modifier = Modifier
                .padding(16.dp)
        ) {
            IconButton(
                onClick = { expanded = !expanded }
            ) {
                Icon(Icons.Default.MoreVert, contentDescription = "this is three dots")
            }

            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                DropdownMenuItem(
                    text = { Text("Profile") },
                    trailingIcon = {Icon(Icons.Default.Person, contentDescription = "profile")},
                    onClick = {
                        // do some actions on click
                    }

                )

                DropdownMenuItem(
                    text = { Text("Setting") },
                    trailingIcon = {Icon(Icons.Default.Settings, contentDescription = "setting")},
                    onClick = {
                        // do some actions on click
                    }



                )

                HorizontalDivider()

                DropdownMenuItem(
                    text = { Text("About") },
                    trailingIcon = {Icon(Icons.Default.AccountBox, contentDescription = "about")},
                    onClick = {
                        // do some actions on click
                    }



                )

            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun DropDownMenuExamplePreview(){
    DropDownMenuExample()
}