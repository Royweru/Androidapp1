package com.example.weruapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weruapp.ui.theme.WeruappTheme

class SignUp : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          signUpDisplay()
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable

fun signUpDisplay(){
    var username by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    var phone by remember {
        mutableStateOf("")
    }
 Column(
     modifier = Modifier
         .background(color = Color.Gray)
         .fillMaxSize()
     ,
     verticalArrangement = Arrangement.Center,
     horizontalAlignment = Alignment.CenterHorizontally

 ) {
     Text(text = "Sign up ",
          fontFamily = FontFamily.Monospace,
         fontSize = 30.sp,
         textAlign = TextAlign.Center,
         )
     Column(
       modifier = Modifier
           .background(color = Color.LightGray)
           .padding(all = 20.dp),
       horizontalAlignment = Alignment.CenterHorizontally

     ) {

         OutlinedTextField(value = username, onValueChange ={username},
             leadingIcon = { Icon(Icons.Default.AccountCircle, contentDescription ="" )},
             label = { Text(text = "Username")},
             modifier = Modifier.fillMaxWidth()
         )
         Spacer(modifier = Modifier.height(20.dp))
         OutlinedTextField(value = password, onValueChange ={password},
             leadingIcon = { Icon(Icons.Default.Lock, contentDescription ="" )},
             label = { Text(text = "password")},
             modifier = Modifier.fillMaxWidth()
         )
         Spacer(modifier = Modifier.height(20.dp))
         OutlinedTextField(value = phone, onValueChange ={phone},
             leadingIcon = { Icon(Icons.Default.Phone, contentDescription ="" )},
             label = { Text(text = "Phone Number")},
             modifier = Modifier.fillMaxWidth()
         )
         Spacer(modifier = Modifier.height(20.dp))
         Button(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxWidth() ) {
             Text(text = "SIGN UP")
         }
     }


 }
}





