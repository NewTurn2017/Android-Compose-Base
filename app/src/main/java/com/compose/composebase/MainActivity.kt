package com.compose.composebase

import android.graphics.drawable.Icon
import android.os.Bundle
import android.widget.TextView
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
import androidx.compose.material.icons.filled.Add
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
                RowEx()
            }
        }
    }
}

@Composable
fun RowEx() {

    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .height(100.dp)
            .width(300.dp)
    ) {
        // underline modifier


        Text(text = "Hello1", modifier = Modifier.weight(2f), textAlign = TextAlign.Center)
        Icon(imageVector = Icons.Filled.Add, contentDescription = "Add", modifier = Modifier.weight(1f))
        Text(text = "Hello2", modifier = Modifier.weight(2f))
        Text(text = "=", modifier = Modifier.weight(1f), textAlign = TextAlign.Center)
        Text(text = "Hello3", modifier = Modifier.weight(2f), textAlign = TextAlign.Center)

    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeBaseTheme {
        RowEx()
    }
}