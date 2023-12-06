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
fun Carbonara(navController: NavController) {
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
                painter = painterResource(id = R.drawable.carbonara),
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
                text = "Macarrão à Carbonara",
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(vertical = 5.dp),
                color = Color.DarkGray,
                style = MaterialTheme.typography.labelMedium

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
                text = "bacon picado a gosto, queijo ralado a gosto, 3 ovos, sal, pimenta-do-reino a gosto, macarrão de sua escolha, creme de leite(opcional)",
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(vertical = 5.dp),
                color = Color(0xFFEC9651),
                fontSize = 10.sp
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
                text = "1) Frite bem o bacon, até ficar crocante | 2)Coloque o macarrão para cozinhar em água e sal | 3) No refratário onde será servido o macarrão" +
                        "bata bem os ovos com um garfo | 4) Tempere com sal, pimente  queijo ralado a gosto | 5) Quando o macarrão estiver pronto, escorra e coloque" +
                        "(bem quente) sobre a mistura de ovos, misture bem | 6) O calor da massa cozinha os ovos | 7) Coloque o bacon, ainda quente, sobre o macarrão" +
                        "e sirva.",
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(vertical = 5.dp),
                color = Color.Black,
                fontSize = 8.sp
            )

        }

        // Botão no final da tela
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