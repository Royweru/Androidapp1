package com.example.weruapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weruapp.ui.theme.WeruappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           mainDis()
        }
    }
}


@Preview(showBackground = true)
@Composable

fun mainDis(){
    var login = LocalContext.current
    Column(
        modifier = Modifier
            .background(color = Color.Cyan)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text ="Welcome to the main page", fontSize = 30.sp, fontWeight = FontWeight.Bold, fontFamily = FontFamily.Cursive )
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = { Intent(login,LoginActivity::class.java) }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "LOGIN")
        }
    }
    
}


