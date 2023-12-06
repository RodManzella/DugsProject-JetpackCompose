package com.example.dugs_jetpackcompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.dugs_jetpackcompose.R

const val ARG_EXAMPLE = "exampleArg"
@Composable
fun ListScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .background(Color.DarkGray)
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center)
                .padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.logodugs),
                contentDescription = "Logo escrito Dug's Recipes",
                modifier = Modifier
                    .size(100.dp)
                    .clip(MaterialTheme.shapes.medium)
                    .align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(30.dp))

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.CenterHorizontally),
                verticalArrangement = Arrangement.Center  
            ) {
                Button(
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent, contentColor = Color.White),
                    onClick = {
                        navController.navigate("Brownie")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .border(2.dp, Color(0xFFEC8474))
                        .padding(10.dp)
                ) {
                    Text("Brownie")
                }
                Button(
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent, contentColor = Color.White),
                    onClick = {
                        navController.navigate("Carbonara")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .border(2.dp, Color(0xFFEC8474))
                        .padding(10.dp)
                ) {
                    Text("Carbonara")
                }
                Button(
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent, contentColor = Color.White),
                    onClick = {
                        navController.navigate("Lasanha")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .border(2.dp, Color(0xFFEC8474))
                        .padding(10.dp)
                ) {
                    Text("Lasanha")
                }
                Spacer(modifier = Modifier.height(30.dp))
                Button(
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFEC8474), contentColor = Color.White),
                    onClick = {
                        navController.navigate("HomeScreen")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp)
                ) {
                    Text("Voltar")
                }
            }
        }
    }
}


