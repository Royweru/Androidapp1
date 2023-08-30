package com.example.weruapp

import android.content.ClipData.Item
import android.graphics.drawable.shapes.Shape
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.weruapp.ui.theme.WeruappTheme
import java.nio.file.WatchEvent

class CardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
         CardDisplay()
        }
    }
}

private val Content = mutableListOf<String>("My people","Garage influence", "What's happening", "Get the hell outa here")

@Preview(showBackground = true)
@Composable
fun CardDisplay(

) {
  Column(modifier = Modifier
      .background(color = Color.Black)
      .fillMaxSize(),
      verticalArrangement = Arrangement.Center,
      horizontalAlignment = Alignment.CenterHorizontally,


  ) {
      Column(
          modifier = Modifier.background(color = Color.LightGray),

      ) {
          val paddingModifier = Modifier.padding(5.dp)

          LazyColumn(){
             items(30){
                 Card(shape = RoundedCornerShape(10.dp), elevation = CardDefaults.cardElevation(10.dp), modifier = paddingModifier,  border = BorderStroke(2.dp,Color.Magenta)) {

                     Image(painterResource(id = R.drawable.lambo), contentDescription ="", modifier = Modifier.size(250.dp), )
                     Text(text = "Hey there this is a lambogini", modifier = Modifier.padding(start = 10.dp), color = Color.Blue, fontWeight = FontWeight.Bold)
                 }
             }
          }
      }
  }
}