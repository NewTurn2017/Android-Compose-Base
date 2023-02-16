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
                Outer()
            }
        }
    }
}

@Composable
fun Outer() {
    Column {
        Inner(
            modifier = Modifier
                .widthIn(min = 100.dp, max = 350.dp)
                .heightIn(min = 160.dp)
        )
    }

}

@Composable
fun Inner(modifier: Modifier = Modifier) {
    BoxWithConstraints(modifier) {
        if (maxHeight > 150.dp) {
            Text(
                text = "여기 꽤 길군요.",
                modifier = Modifier.align(Alignment.BottomCenter),
            )
        }
        Text("maxW: ${maxWidth}, maxH: ${maxHeight}, minW: ${minWidth}, minH: $minHeight")
    }

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeBaseTheme {
        Outer()
    }
}