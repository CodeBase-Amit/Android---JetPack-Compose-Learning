package com.example.jetpackcomposelearning.`3_CoreComponents`

import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposelearning.R


@Composable
fun SimpleText(){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "Hello Jetpack Compose",
            color = Color.Blue,
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            style = TextStyle(
                shadow = Shadow(color = Color.Green, blurRadius = 10f)
            )
            )
    }


}


@Composable
fun ColorFullText(){
    val rainbowColors = listOf(
        Color.Red,
        Color.Cyan,
        Color.Yellow,
        Color.Green,
        Color.Blue,
        Color.Magenta
    )
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        Text(
            text = buildAnnotatedString {
                append("Do not allow people to dim your shine \n")
                withStyle(
                    SpanStyle(
                        brush = Brush.linearGradient(
                            colors = rainbowColors

                        )
                    )
                ) {
                    append("because they are blinded")
                }
                append("\n tell them to put some sunglasses on")
            }
        )
    }
}

@Composable
fun ScrollableText(){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "Hey this is Amit Sharma experimenting with the Jetpack Compose".repeat(50),
            maxLines = 2,
//            modifier = Modifier.basicMarquee(),
            fontSize = 50.sp,
            overflow = TextOverflow.Ellipsis

        )
    }
}


@Preview(showSystemUi = true)
@Composable
fun SimpleTextPreview(){
//    SimpleText()
//    ColorFullText()
    ScrollableText()
}







