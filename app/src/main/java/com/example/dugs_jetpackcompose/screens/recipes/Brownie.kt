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
fun Brownie(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .align(Alignment.TopCenter)  // Alinhe a coluna no topo
                .padding(16.dp)
        ) {
            // Imagem do Brownie no topo e centralizado
            Image(
                painter = painterResource(id = R.drawable.brownie),
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

            // Texto abaixo da imagem
            Text(
                text = "Brownie",
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
                text = "5 colheres de manteiga, 3 ovos, 3 xícaras de achocolatado, 6 colheres de açúcar e 12 colheres de farinha de trigo",
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
                text = "1) Derreta a manteira e Reserve | 2)Enquanto a manteiga derrete, misture os ovos junto com o açúcar | 3) Acrescente a manteiga derretida" +
                        "no ovo e no açúcar | 4) Agora é só misturar o achocolatado e o trigo | 5) Unte uma forma com manteiga e achocolatado | 6) Leve ao forno a 180 graus" +
                        "por 30 minutos",
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
                .fillMaxWidth(0.5f)  // Largura definida como 50% da largura máxima
                .align(Alignment.BottomCenter)  // Alinhe o botão na parte inferior
        ) {
            Text("Voltar")
        }
    }
}

