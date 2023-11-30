package com.example.dugs_jetpackcompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.dugs_jetpackcompose.R

@Composable
fun TeamScreen(){
    Box(

        modifier = Modifier
            .background(Color.DarkGray)
            .fillMaxSize()

    ){

        Image(
            painter = painterResource(id = R.drawable.ingredients),
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
        Text(
            buildAnnotatedString {
                withStyle(style = SpanStyle(color = Color.White)) {
                    append("Nossa ")
                }
                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, color = Color(0xFFEC8474))) {
                    append("equipe")
                }
            },
            fontFamily = FontFamily.SansSerif,
            fontSize = 28.sp,
            color = Color.Black,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            style = LocalTextStyle.current.merge(
                TextStyle(
                    lineHeight = 1.5.em
                )
            ))
        Row(
            modifier = Modifier
                .padding(top = 40.dp, start = 15.dp)
                .align(Alignment.CenterHorizontally))
        {
            Column (){
                Image(
                    painter = painterResource(id = R.drawable.eu),
                    contentDescription = "Logo escrito Dug's Recipes",
                    modifier = Modifier
                        .size(150.dp)
                        .clip(MaterialTheme.shapes.medium)
                )
                Text(text = "Eduarda",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 18.sp,
                    color = Color(0xFFEC8474),
                    modifier = Modifier.padding(
                        top = with(LocalDensity.current) { (20.dp) },
                        start = with(LocalDensity.current) { (30.dp) })
                    )
                Text(text = "Adora musicais," +
                    "\nlivros e qualquer \ntipo de comida",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 12.sp,
                    color = Color.White,
                    modifier = Modifier.padding(
                        top = with(LocalDensity.current) { (20.dp) },
                        start = with(LocalDensity.current) { (30.dp) })
                )
            }
            Column () {
                Image(
                    painter = painterResource(id = R.drawable.xim),
                    contentDescription = "Logo escrito Dug's Recipes",
                    modifier = Modifier
                        .size(150.dp)
                        .clip(MaterialTheme.shapes.medium)
                )
                Text(text = "Rodrigo",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 18.sp,
                    color = Color(0xFFEC8474),
                    modifier = Modifier.padding(
                        top = with(LocalDensity.current) { (20.dp) },
                        start = with(LocalDensity.current) { (30.dp) })
                )
                Text(text = "Gosta de programação\ne perfumes",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 12.sp,
                    color = Color.White,
                    modifier = Modifier.padding(
                        top = with(LocalDensity.current) { (20.dp) },
                        start = with(LocalDensity.current) { (30.dp) })
                )
            }
        }
   }
}

@Preview
@Composable
fun PreviewTeamScreen() {
    TeamScreen()
}