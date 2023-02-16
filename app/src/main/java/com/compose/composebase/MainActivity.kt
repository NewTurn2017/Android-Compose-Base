package com.compose.composebase

import android.graphics.drawable.Icon
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Send
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.compose.composebase.ui.theme.ComposeBaseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBaseTheme {
                BoxEx()
            }
        }
    }
}

@Composable
fun BoxEx() {

//    Box(
//        modifier = Modifier.size(100.dp)
//    ) {
//        Text(text = "Hello World", modifier = Modifier.align(Alignment.BottomEnd))
//        Text(text = "Jetpack Compose", modifier = Modifier.align(Alignment.TopStart))
//    }
//    Box(modifier = Modifier.size(100.dp)) {
//        Box(modifier = Modifier.size(70.dp).background(Color.Red).align(Alignment.TopStart))
//        Box(modifier = Modifier.size(70.dp).background(Color.Blue).align(Alignment.BottomEnd))
//    }
    Box {
        Box(modifier = Modifier.fillMaxSize().background(Color.Red).align(Alignment.CenterStart))
        Box(modifier = Modifier.size(70.dp).background(Color.Blue).align(Alignment.Center))
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeBaseTheme {
        BoxEx()
    }
}