package com.compose.composebase

import android.graphics.drawable.Icon
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.compose.AsyncImagePainter
import coil.compose.rememberImagePainter
import com.compose.composebase.MainActivity.Companion.cardData
import com.compose.composebase.ui.theme.ComposeBaseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBaseTheme {
                Column(
                    verticalArrangement = Arrangement.Top,
                ) {
                    CardEx()
                    Spacer(modifier = Modifier.height(4.dp))
                    CardEx()
                }

            }
        }


    }

    companion object {
        val cardData = CardData(
            imageUrl = "https://images.unsplash.com/photo-1570295999919-56ceb5ecca61?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1480&q=80",
            imageDescription = "Image",
            author = "Dev Devil",
            description = "이 사람은 잘 생겼군요"
        )
    }

}

@Composable
fun CardEx() {

    val cardBackground = Color(0xFFE0E0E0)
    val placeHolderColor = Color(0xFFC98585)

    Card(
        elevation = 8.dp,
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth()
            .height(100.dp),
        shape = RoundedCornerShape(8.dp),
        backgroundColor = cardBackground,
        border = BorderStroke(1.dp, Color.Cyan),
        contentColor = Color.Black,
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            AsyncImage(
                model = cardData.imageUrl,
                contentDescription = cardData.imageDescription,
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape),
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column(
                modifier = Modifier
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = cardData.author, fontSize = 32.sp, fontWeight = FontWeight.Bold)
                Text(text = cardData.description, fontSize = 16.sp)
            }
        }
    }

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeBaseTheme {
        Column(
            verticalArrangement = Arrangement.Top,
        ) {
            CardEx()
            Spacer(modifier = Modifier.height(4.dp))
            CardEx()
        }
    }
}

data class CardData(
    val imageUrl: String,
    val imageDescription: String,
    val author: String,
    val description: String
)
