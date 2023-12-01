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
import androidx.compose.ui.platform.LocalContext
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
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.dugs_jetpackcompose.R
const val ARG_EXAMPLE = "exampleArg"
@Composable
fun ContactScreen(navController: NavController){

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
       val exampleArg = rememberNavController().previousBackStackEntry?.arguments?.getString(
           ARG_EXAMPLE)
        Text(text = "VALOR:  $exampleArg")
        val route = LocalContext.current as NavBackStackEntry
        val name = route.arguments?.getString("name") ?: "Nome não encontrado"

        // Aqui você pode usar 'name' como desejar
        // Por exemplo, exibir o nome na tela
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Text("Name: $name")
        }


        Button(
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFEC8474), contentColor = Color.White),
            onClick = {
                navController.navigate("TeamScreen")
            },
            modifier = Modifier
                .padding(20.dp)
                .align(Alignment.CenterHorizontally)
        ) {
            Text("Voltar")
        }


}}

