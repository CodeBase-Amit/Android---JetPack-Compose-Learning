package com.example.jetpackcomposelearning.`3_CoreComponents`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withLink
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun PartiallySelectableText(){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){

        SelectionContainer() {

            Column {
                Text("This text is selectable")
                Text("This is a text")
                Text("This is one too")
                Text("This is the third text")
                DisableSelection {
                    Text("This text is not selectable")
                    Text("This is also not selectable")
                }
            }
        }

    }
}


@Composable
fun AnnotatedStringwithListenerSample(){

    val uriHandler = LocalUriHandler.current

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(

            buildAnnotatedString {
                append("Build better apps faster with")
                val Link = LinkAnnotation.Url(
                    "https://developer.android.com/develop/ui/compose/documentation",
                    TextLinkStyles(
                        SpanStyle(
                            color = Color.Blue
                        )
                    )
                ){
                    val url = (it as LinkAnnotation.Url).url
                    uriHandler.openUri(url)
                }

                withLink(Link){
                    append("Jetpack Compose")
                }
            }
        )
    }


}

@Preview(showSystemUi = true)
@Composable
fun PartiallySelectableTextPreview(){
//    PartiallySelectableText()
    AnnotatedStringwithListenerSample()
}