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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Send
import androidx.compose.runtime.Composable
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
                ModifierEx(onButtonClicked = {

                })
            }
        }
    }
}

@Composable
fun ModifierEx(onButtonClicked: () -> Unit) {
    Button(
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Green,
            contentColor = Color.White
        ),
        onClick = onButtonClicked,
        modifier = Modifier
            .size(200.dp)
            .padding(10.dp),
        enabled = false

    ) {
        Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = null,
            modifier = Modifier
                .background(Color.Red)
                .offset(x = -20.dp)
        )
        Spacer(modifier = Modifier
            .width(ButtonDefaults.IconSpacing)
            .background(Color.Red))
        Text(
            text = "NAVER",
            modifier = Modifier
                .offset(x = 20.dp)
                .background(Color.Red),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeBaseTheme {
        ModifierEx(onButtonClicked = {})
    }
}