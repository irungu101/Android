package com.alex.myfirstandroidproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alex.myfirstandroidproject.ui.theme.MyFirstAndroidProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFirstAndroidProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   HelloWorld("Robert")
                }
            }
        }
    }
}


@Composable
fun HelloWorld(name: String){
   Column {

       Text(text = "Hey $name! Welcome Back",
           fontSize = 15.sp,
           color = Color.Black,
           fontFamily = FontFamily.SansSerif,
           fontStyle = FontStyle.Italic,
           textAlign = TextAlign.Center,
           modifier = Modifier
               .background(Color.Gray)
               .padding(20.dp)
               .wrapContentHeight(align = Alignment.CenterVertically)



       )
       Spacer(modifier = Modifier.height(20.dp))
       TextFieldEmailComponent()
       Spacer(modifier = Modifier.height(20.dp))
       TextFieldComponent()
       Spacer(modifier = Modifier.height(20.dp))
       TextFieldLocationComponent()
       Spacer(modifier = Modifier.height(20.dp))
       Button(onClick = {},
           modifier = Modifier
               .fillMaxWidth()
               .padding(10.dp),
           colors = ButtonDefaults.buttonColors(Color.DarkGray))
       {
           Text(text = "Login Here")
       Spacer(modifier = Modifier.height(20.dp))

       }
       Button(onClick = {},
           modifier = Modifier
               .fillMaxWidth()
               .padding(10.dp),
           colors = ButtonDefaults.buttonColors(Color.DarkGray))
       {
           Text(text = "Register Here")}


//       Text(text = "Hey I am a software Developer/ Android Developer",
//           fontSize = 23.sp,
//           color = Color.Blue,
//           fontFamily = FontFamily.SansSerif,
//           fontStyle = FontStyle.Italic,
//           textAlign = TextAlign.Center,
//           modifier = Modifier.background(Color.Gray)
//               .padding(20.dp)
//               .wrapContentHeight(align = Alignment.CenterVertically)
//
//
//
//
//       )
   }
}
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun HelloWorldPreview(){
    HelloWorld("Robert")
}
@Composable
fun TextFieldComponent(){
    var text by remember {
        mutableStateOf(value = "")
    }
    TextField(modifier = Modifier.fillMaxWidth(),
        value = text, onValueChange = {
        newText -> text = newText
    },
    label = {Text(text = "Enter your Name")}, 
        placeholder = {
            Text(text = "Please Enter your Name")
        })


}
@Composable
fun TextFieldEmailComponent(){
    var text by remember {
        mutableStateOf(value = "")
    }
    TextField(modifier = Modifier.fillMaxWidth(),
        value = text, onValueChange = {
                newText -> text = newText
        },
        label = {Text(text = "Enter your Email")},
        placeholder = {
            Text(text = "Please Enter your Email")
        })


}
@Composable
fun TextFieldLocationComponent(){
    var text by remember {
        mutableStateOf(value = "")
    }
    TextField(modifier = Modifier.fillMaxWidth(),
        value = text, onValueChange = {
                newText -> text = newText
        },
        label = {Text(text = "Enter your Location")},
        placeholder = {
            Text(text = "Please Enter your Location")
        })


}

