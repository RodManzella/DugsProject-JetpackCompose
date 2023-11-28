package com.example.dugs_jetpackcompose.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

data class NavItem(
    val label: String,
    val icon: ImageVector,
    val route: String
)

val listOfNavItems = listOf(
    NavItem(
        label = "Home",
        icon = Icons.Default.Home,
        route = Screens.HomeScreen.name
    ),
    NavItem(
        label = "Login",
        icon = Icons.Default.Person,
        route = Screens.LoginScreen.name
    ),
    NavItem(
        label = "Register",
        icon = Icons.Default.AccountBox,
        route = Screens.RegisterScreen.name
    )
)


