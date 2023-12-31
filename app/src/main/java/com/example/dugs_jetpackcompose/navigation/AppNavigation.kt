package com.example.dugs_jetpackcompose.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.dugs_jetpackcompose.screens.HomeScreen
import com.example.dugs_jetpackcompose.screens.AboutScreen
import com.example.dugs_jetpackcompose.screens.TeamScreen
import com.example.dugs_jetpackcompose.R
import com.example.dugs_jetpackcompose.screens.ListScreen
import com.example.dugs_jetpackcompose.screens.recipes.Brownie
import com.example.dugs_jetpackcompose.screens.recipes.Carbonara
import com.example.dugs_jetpackcompose.screens.recipes.Lasanha

private fun Modifier.background(b: Boolean, onClick: () -> Unit, icon: () -> Unit, label: () -> Unit) {
}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppNavigation(){
    val navController : NavHostController = rememberNavController()

    Scaffold(
        bottomBar = {
            NavigationBar(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Blue)
            ){
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination
                listOfNavItems.forEach{navItem ->
                    NavigationBarItem(
                        selected = currentDestination?.hierarchy?.any{it.route == navItem.route} == true,
                        onClick = {
                                  navController.navigate(navItem.route){
                                      popUpTo(navController.graph.findStartDestination().id){
                                          saveState = true
                                      }
                                      launchSingleTop = true
                                      restoreState = true
                                  }
                        },
                        icon = {
                               Icon(imageVector = navItem.icon,
                                   contentDescription = null,
                                   tint = Color(0xFFEC8474))
                        },
                        label = {
                            Text(text = navItem.label,
                                color = Color(0xFFEC8474))
                        }
                    )
                }




            }
        }
    ) {paddingValues ->
        NavHost(
            navController = navController,
            startDestination = Screens.HomeScreen.name,
            modifier = Modifier
                .padding(paddingValues)
        ){
            composable(route = Screens.HomeScreen.name){
                HomeScreen(navController)
            }
            composable(route = Screens.AboutScreen.name){
                AboutScreen(navController)
            }
            composable(route = Screens.TeamScreen.name){
                TeamScreen(navController)
            }
            composable(route = Screens.ListScreen.name){
                ListScreen(navController)
            }
            composable(route = Screens.Brownie.name){
                Brownie(navController)
            }
            composable(route = Screens.Carbonara.name){
                Carbonara(navController)
            }
            composable(route = Screens.Lasanha.name){
                Lasanha(navController)
            }
        }
    }
}

@Preview
@Composable
fun PreviewAppNavigation() {
    AppNavigation()
}