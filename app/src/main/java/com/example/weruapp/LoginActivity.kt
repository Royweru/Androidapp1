package com.example.weruapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.weruapp.ui.theme.WeruappTheme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           loginInterface()
            }
        }
    }

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)

@Composable




fun loginInterface(){
    var username by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
            .background(Color.Red)
            .fillMaxSize()
    ) {
      Text(text = "Welcome back, please login", color = Color.White, fontSize = 15.sp)
      OutlinedTextField(value = username,
          onValueChange ={username} ,
          label = { Text(text = "Username")},
          modifier = Modifier.fillMaxWidth()
          )
      OutlinedTextField(value = password,
            onValueChange ={password} ,
            label = { Text(text = "password")},
            modifier = Modifier.fillMaxWidth()
        )
    }
}