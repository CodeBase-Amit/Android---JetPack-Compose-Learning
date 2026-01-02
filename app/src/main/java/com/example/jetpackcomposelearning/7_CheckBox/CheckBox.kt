package com.example.jetpackcomposelearning.`7_CheckBox`

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CheckBoxExample() {

    val childCheckedStates = remember {
        mutableListOf(false, false, false)
    }

    val parentState = when {
        childCheckedStates.all { it } -> ToggleableState.On
        childCheckedStates.none() -> ToggleableState.Off
        else -> ToggleableState.Indeterminate

    }

    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Select all")
            TriStateCheckbox(
                state = parentState,
                onClick = {
                    val newState = parentState != ToggleableState.On
                    childCheckedStates.forEachIndexed() { index, _ ->
                        childCheckedStates[index] = newState
                    }
                }
            )

        }
            childCheckedStates.forEachIndexed { index, checked ->

                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("Option ${index + 1}")
                    Checkbox(
                        checked = checked,
                        onCheckedChange = {
                            childCheckedStates[index] = it
                        }
                    )
                }
            }
    }

    if (childCheckedStates.all { it }) {
        Text("All options checked")
    }
}

@Preview(showSystemUi = true)
@Composable
fun CheckExamplePreview(){
    CheckBoxExample()
}