package com.example.dugs_jetpackcompose.screens


import android.content.Intent
import android.media.Image
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.ComposeCompilerApi
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.dugs_jetpackcompose.R
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.remember
import androidx.compose.ui.draw.scale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em

@Composable
fun HomeScreen(){
    Box(

        modifier = Modifier
            .background(Color.DarkGray)
            .fillMaxSize()

    ){

        Image(
            painter = painterResource(id = R.drawable.alimentos),
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
            Text(text = "As melhores receitas você encontra em nosso site!\n",
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif,
                fontSize = 15.sp,
                color = Color.White,
                modifier = Modifier.align(Alignment.CenterHorizontally),
                style = LocalTextStyle.current.merge(
                    TextStyle(
                        lineHeight = 1.5.em)))

        Text(text = "O objetivo do Dug’s Recipes é despertar o amor pela culinária em pessoas que não acreditam terem \"sido feitas para a cozinha\". \n" +
            "em nosso site oficial você ainda poderá encontrar um ambiente repleto de receitas, das mais práticas até as mais avançadas - você escolhe! Tudo será adaptado às suas preferências alimentares e nível de habilidade.",
            fontFamily = FontFamily.SansSerif,
            fontSize = 12.sp,
            color = Color.White,
            style = LocalTextStyle.current.merge(
                TextStyle(
                    lineHeight = 1.5.em
                    )
        ))
            Button(
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFEC8474), contentColor = Color.White),
                onClick = {

                },
                modifier = Modifier
                    .padding(20.dp)
                    .align(Alignment.CenterHorizontally)
            ) {
                Text("Saiba mais")
            }
    }
    Image(
        painter = painterResource(id = R.drawable.food),
        contentDescription = "Panela com feijoada",
        modifier = Modifier
            .size(1000.dp)
            .clip(MaterialTheme.shapes.medium)
            .scale(1.2f)
            .fillMaxWidth()
            .padding(top = with(LocalDensity.current) { (350.dp) })
    )
}


@Preview
@Composable
fun PreviewHomeScreen() {
    HomeScreen()
}

