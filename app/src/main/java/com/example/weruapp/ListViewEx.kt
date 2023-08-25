package com.example.weruapp

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weruapp.ui.theme.WeruappTheme
import java.time.format.TextStyle

class ListViewEx : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
         myList()
        }
    }
}

private val country = mutableListOf<String>("1.Kenya","2.Uganda","3.Tanzania","4.Burundi","5.Rwanda")
private val listModifier = Modifier
    .fillMaxSize()
    .background(color = Color.DarkGray)
    .padding(all = 4.dp)

private val textStyle = androidx.compose.ui.text.TextStyle(fontSize = 30.sp, color = Color.Black, fontWeight = FontWeight.Bold, fontFamily = FontFamily.Monospace, textDecoration = TextDecoration.Underline)
@Preview(showBackground = true)
@Composable
fun myList() {
    LazyColumn(modifier = listModifier, verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally, userScrollEnabled = true){
         items(country){
             countr ->( Card(modifier = Modifier.fillMaxWidth().padding(bottom = 10.dp, start = 5.dp),

             ) {
             Image(painter = painterResource(R.drawable.logo1) , contentDescription ="" , modifier = Modifier.size(70.dp))
             Text(text = countr, style = textStyle)
         })
         }
    }
}


