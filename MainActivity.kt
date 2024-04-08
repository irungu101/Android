package com.naomi.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding

import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.naomi.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {



                        Box(
                            modifier = Modifier
                                .fillMaxWidth(0.5f)
                                .padding(20.dp)

                        ){
                            ImageCard(painter = painterResource(id = R.drawable.card), contentDescription = "mycard", title = "This is a nature picture")
                        }
                        Spacer(modifier = Modifier.height(20.dp))
                        Spacer(modifier = Modifier.height(20.dp))

                        Box(
                            modifier = Modifier
                                .fillMaxWidth(0.5f)
                                .padding(20.dp)

                        ){
                            ImageCard2(painter = painterResource(id = R.drawable.nature), contentDescription = "mycard2", title = "This is my nature picture")
                        }

                    }

                }
            }
        }
    }
}

@Composable
fun ImageCard(painter: Painter, contentDescription:String,title:String){
    Card(
        modifier = Modifier.wrapContentWidth(),
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(20.dp)
    ){
        Box(
            modifier = Modifier.height(200.dp)
        )
        {
            Image(painter = painter, contentDescription = contentDescription, contentScale = ContentScale.Crop)
            Box (
                modifier = Modifier
                    .matchParentSize()
                    .padding(15.dp),
                contentAlignment = Alignment.BottomStart
            ) {
                Text(text = title,
                    color = Color.Black,
                    fontSize = 15.sp
                )
            }
        }


    }
}
@Composable
fun ImageCard2(painter: Painter, contentDescription:String,title:String){
    Card(
        modifier = Modifier.wrapContentWidth(),
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(20.dp)
    ){
        Box(
            modifier = Modifier.height(200.dp)
        )
        {
            Image(painter = painter, contentDescription = contentDescription, contentScale = ContentScale.Crop)
            Box (
                modifier = Modifier
                    .matchParentSize()
                    .padding(15.dp),
                contentAlignment = Alignment.BottomStart
            ) {
                Text(text = title,
                    color = Color.Black,
                    fontSize = 15.sp
                )
            }
        }


    }
}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ImageCardPreview(){
    ImageCard(painter = painterResource(id = R.drawable.card), contentDescription = "mycard", title = "This is a nature picture" )

}
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ImageCardPreview2(){
    ImageCard(painter = painterResource(id = R.drawable.nature), contentDescription = "mycard2", title = "This is my nature picture" )

}
