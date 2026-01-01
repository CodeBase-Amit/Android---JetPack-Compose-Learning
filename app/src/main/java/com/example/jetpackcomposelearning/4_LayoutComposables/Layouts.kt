package com.example.jetpackcomposelearning.`4_LayoutComposables`

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

//COLUMN - it allows you to place its children in a vertical sequence

@Composable

fun ColumnExplain() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue)
            .padding(15.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text("text 1")
        Text("text 2")
        Text("text 3")
        Text("text 4")
        Text("text 5")
    }

}

//ROW - it allows you to place its children in a horizontal sequence

@Composable
fun RowExample() {

    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green)
            .padding(15.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text("text 1")
        Text("text 2")
        Text("text 3")
        Text("text 4")
        Text("text 5")
    }
}

//BOX - it is an empty container where things come on top of each other

@Composable
fun BoxExample() {

    Box(
        modifier = Modifier
            .size(200.dp)
            .background(Color.Red),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .size(150.dp)
                .background(Color.Black),
        )
    }
}

//CONSTRAINT LAYOUT - use only when needed and layout is very complex

@Composable
fun ConstraintLayoutExample() {

    Column {
        ConstraintLayout(
            modifier = Modifier
                .fillMaxSize()
                .height(100.dp)
                .background(color = Color.LightGray)
        ) {

            val (text1, text2, text3) = createRefs()

            Text(
                "Bottom Left",
                modifier = Modifier.constrainAs(text1) {
                    bottom.linkTo(parent.bottom, margin = 8.dp)
                    start.linkTo(parent.start, margin = 8.dp)
                }
            )

            Text(
                "Center Left",
                modifier = Modifier.constrainAs(text2) {
                    top.linkTo(parent.top, margin = 8.dp)
                    bottom.linkTo(parent.bottom, margin = 8.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
            )

            Text(
                "Top Right",
                modifier = Modifier.constrainAs(text3) {
                    top.linkTo(parent.top, margin = 8.dp)
                    end.linkTo(parent.end)
                }
            )
        }
    }
}

//@Preview(showSystemUi = true)
//@Composable
//fun ColumnExamplePreview() {
//    ColumnExplain()
//}

//@Preview(showSystemUi = true)
//@Composable
//fun RowExamplePreview() {
//    RowExample()
//}

//@Preview(showSystemUi = true)
//@Composable
//fun BoxExamplePreview() {
//    BoxExample()
//}

@Preview(showSystemUi = true)
@Composable
fun ConstraintLayoutExamplePreview() {
    ConstraintLayoutExample()
}

//BEST PRACTICE

//Do not do Overnesting

