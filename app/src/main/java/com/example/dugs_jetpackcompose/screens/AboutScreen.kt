package com.example.dugs_jetpackcompose.screens

import android.content.Intent
import android.net.Uri
import androidx.activity.ComponentActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.dugs_jetpackcompose.R

@Composable
fun AboutScreen(){
    Box(

        modifier = Modifier
            .background(Color.DarkGray)
            .fillMaxSize()

    ){

        Image(
            painter = painterResource(id = R.drawable.bg1),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Transparent),
            contentScale = ContentScale.Crop

        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.logodugs),
                contentDescription = "Logo escrito Dug's Recipes",
                modifier = Modifier
                    .size(100.dp)
                    .clip(MaterialTheme.shapes.medium)
            )
        }

    }

    Column ( modifier = Modifier
        .fillMaxHeight()
        .fillMaxWidth()
        .padding(
            top = with(LocalDensity.current) { (150.dp) },
            start = with(LocalDensity.current) { (30.dp) },
            end = with(LocalDensity.current) { (30.dp) }))
    {
        Text(text = "Sobre nós",
            fontFamily = FontFamily.SansSerif,
            fontSize = 23.sp,
            color = Color.Black,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            style = LocalTextStyle.current.merge(
                TextStyle(
                    lineHeight = 1.5.em
                )
            ))
        Image(
            painter = painterResource(id = R.drawable.plate),
            contentDescription = "Prato de comida",
            modifier = Modifier
                .size(220.dp)
                .padding(
                    start = with(LocalDensity.current) { (20.dp) },
                    top = with(LocalDensity.current) { (0.dp) },
                    bottom = with(LocalDensity.current) { (0.dp) },
                )
                .align(Alignment.CenterHorizontally)
        )
        Text(text = "Somos um time apaixonado de entusiastas culinários e cozinheiros caseiros que acreditam que a boa comida deve ser acessível a todos.\n" +
            "Nossa missão é inspirar você a explorar o prazer da culinária, oferecendo uma variedade de receitas práticas e deliciosas que podem ser preparadas sem estresse.",
            fontFamily = FontFamily.SansSerif,
            fontSize = 12.sp,
            color = Color.Black,
            style = LocalTextStyle.current.merge(
                TextStyle(
                    lineHeight = 1.5.em
                )
            ))

        OpenUrlButton()

    }

}

@Composable
fun OpenUrlButton(){
    val gitHub = "https://github.com/RodManzella/SiteDupla-Portfolio"
    val context = LocalContext.current
    val gintent = remember{Intent(Intent.ACTION_VIEW, Uri.parse(gitHub))}


        Button(
            modifier = Modifier
                .padding(
                    top = with(LocalDensity.current) { (20.dp) },
                    start = with(LocalDensity.current) { (30.dp) }),

            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFEC8474), contentColor = Color.White),
            onClick = { context.startActivity(gintent) },
            ) {
            Text(text = "Acesse nosso projeto no Github!")
        }



}



@Preview
@Composable
fun PreviewAboutScreen() {
    AboutScreen()
}
