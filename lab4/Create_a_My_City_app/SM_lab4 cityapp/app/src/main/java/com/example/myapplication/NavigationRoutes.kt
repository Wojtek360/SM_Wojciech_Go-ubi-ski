package com.example.myapplication

sealed class Screen(val route: String){
    object Home : Screen("home")
    object Monuments: Screen("monuments")
    object Museums : Screen("museums")
    object Parks : Screen("parks")
    object Food : Screen("food")
}