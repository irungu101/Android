package com.naomi.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.naomi.jetpackcompose.ui.theme.JetpackComposeTheme

class LazyColumnActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val students = listOf("John", "Brian", "Andrew",
                        "Simon", "June", "Esther",
                        "Ann", "Njoki", "Jude",
                        "Robert", "Nicole", "Benja")
                    LazyHome(students)
                }
            }
        }
    }
}

@Composable
fun LazyHome(students: List<String>){
    Box (modifier = Modifier.fillMaxSize()){
        Image(painter = painterResource(id = R.drawable.pexels),
            contentDescription = "backgroundimage",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize())
    }
    Column(modifier = Modifier.fillMaxSize()) {
        LazyColumn(contentPadding = PaddingValues(20.dp)) {
            items(items =students){
                item ->
                ColumnCard(name = item)
            }
        }
    }
}

@Composable
fun ColumnCard(name: String){
    Card (modifier = Modifier
        .padding(10.dp)
        .fillMaxWidth()
        .wrapContentHeight()
        .aspectRatio(1.5f),
    colors = CardDefaults
        .cardColors(containerColor = Color.DarkGray),
        elevation = CardDefaults.cardElevation(10.dp)) {
        Box (modifier = Modifier
            .padding(10.dp)
            .fillMaxSize(),
            contentAlignment = Alignment.Center
        )
        {
           Text(text = name)
        }
    }
}
@Preview
@Composable
fun LazyHomePreview(){
//    LazyHome(students = )
}