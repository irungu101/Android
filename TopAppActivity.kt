package com.naomi.jetpackcompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.naomi.jetpackcompose.ui.theme.JetpackComposeTheme

class TopAppActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
//                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   TopApp()
                }
            }
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopApp(){
    val context = LocalContext.current.applicationContext
  TopAppBar(
      title = { Text(text = "eMobilis") },
      navigationIcon = {
          IconButton(onClick = { Toast.makeText(context,"You have clicked a home Icon", Toast.LENGTH_SHORT).show()}) {
              Icon(imageVector = Icons.Filled.Home, contentDescription = "home")
          }
      },
      colors = TopAppBarDefaults.topAppBarColors(
          containerColor = Color.LightGray,
          titleContentColor = Color.White,
          navigationIconContentColor = Color.White
      ),
      actions = {
          IconButton(onClick = {Toast.makeText(context, "You have clicked on the search Icon", Toast.LENGTH_SHORT).show()}) {
              Icon(imageVector = Icons.Filled.Search, contentDescription = "search", tint = Color.White)
          }
          IconButton(onClick = {Toast.makeText(context, "You have clicked on the share Icon", Toast.LENGTH_SHORT).show()}) {
              Icon(imageVector = Icons.Filled.Share, contentDescription = "share", tint = Color.White)

          }
          IconButton(onClick = {Toast.makeText(context, "You have clicked on the menu Icon", Toast.LENGTH_SHORT).show() }) {
              Icon(imageVector = Icons.Filled.Menu, contentDescription = "menu", tint= Color.White)
          }
          IconButton(onClick = {Toast.makeText(context,"You have clicked on the person Icon", Toast.LENGTH_SHORT).show()}) {
              Icon(imageVector = Icons.Filled.Person, contentDescription = "person", tint= Color.White)

          }
      })
}
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun TopAppPreview(){
    TopApp()
}