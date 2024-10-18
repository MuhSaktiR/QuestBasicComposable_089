package com.example.composablelayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composablelayout.ui.theme.ComposableLayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposableLayoutTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicCompose(
                        modifier = Modifier.padding(innerPadding),
                    )
                }
            }
        }
    }
}

@Composable
fun BasicCompose(modifier: Modifier = Modifier) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier.fillMaxWidth().padding(top = 16.dp))
    {
        Text(
            text = "Login",
            style = TextStyle(
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Green
            )
        )

        Text(
            text = "Ini adalah halaman login",
            style = TextStyle(
                fontSize = 18.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )
        )
    }

    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth())
    {
        Image(painter = painterResource(id = R.drawable.umy2),
            contentDescription = null,
            modifier = Modifier.size(330.dp).padding(top = 120.dp)
        )

        Text(
            text = "Nama",
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp,
            color = Color.Green,
            modifier = Modifier.padding(top = 10.dp)
        )

        Text(text = "Muhamad Sakti Ramadhan",
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight =  FontWeight.Bold,
                color = Color.Black
            )
        )

        Text(text = "20220140089",
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight =  FontWeight.Bold,
                color = Color.Black
            ),
            modifier = Modifier.padding(bottom = 10.dp)
        )

        Image(painter = painterResource(id = R.drawable.saya),
            contentDescription = null,
            modifier = Modifier.fillMaxWidth().padding(bottom = 60.dp).clip(CircleShape)
        )// atau ""
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposableLayoutTheme {
        Greeting("Android")
    }
}