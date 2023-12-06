package com.example.dugs_jetpackcompose.screens.recipes

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.dugs_jetpackcompose.R

@Composable
fun Lasanha(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(16.dp)
        ) {

            Image(
                painter = painterResource(id = R.drawable.lasanha),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(200.dp)
                    .padding(15.dp)
                    .clip(CircleShape)
                    .align(Alignment.CenterHorizontally)
                    .border(
                        BorderStroke(4.dp, Color(0xFFEC9651)),
                        CircleShape
                    ),

                )


            Text(
                text = "Lasanha",
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(vertical = 5.dp),
                color = Color.DarkGray,
                style = MaterialTheme.typography.displaySmall

            )

            Text(
                text = "Ingredientes:",
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(vertical = 5.dp),
                color = Color(0xFFEC9651),
                style = MaterialTheme.typography.displaySmall

            )

            Text(
                text = "500g de massa de lasanha, 500g de carne moída, 500g de presunto, sal a gosto, 3 colheres de farinha de trigo, 3 colheres de óleo," +
                        "3 colheres de manteiga, 3 dentes de alho amassados, 1 caixa de molho de tomate, 2 copos de leite, 3 colheres de farinha de trigo",
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(vertical = 5.dp),
                color = Color(0xFFEC9651),
                fontSize = 8.sp
            )

            Text(
                text = "Preparo:",
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(vertical = 5.dp),
                color = Color.Black,
                style = MaterialTheme.typography.displaySmall

            )

            Text(
                text = "1) Cozinha a massa segundo as orientações do fabricante | 2) Refogue o alho, a carne moída e o molho de tomate, deixe cozinhar por 3 min e reserve" +
                        "| 3) derreta a manteira e coloque 3 colheres de farinha de trigo e mexa | 4) Despeje o leite aos poucos e vá mexendo",
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(vertical = 5.dp),
                color = Color.Black,
                fontSize = 8.sp
            )

        }


        Button(
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFEC8474), contentColor = Color.White),
            onClick = {
                navController.navigate("ListScreen")
            },
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(0.5f)
                .align(Alignment.BottomCenter)
        ) {
            Text("Voltar")
        }
    }
}