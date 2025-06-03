package com.example.myapplication.ui.theme

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.myapplication.Screen
import com.example.myapplication.viewmodel.RomeViewModel

@Composable
fun RomeNavHost(
    navController: NavHostController,
    viewModel: RomeViewModel
){
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ){
        composable(Screen.Home.route){
            HomeScreen(navController)
        }
        composable(Screen.Monuments.route){
            MonumentsScreen(viewModel)
        }
        composable(Screen.Parks.route){
            ParksScreen(viewModel)
        }

        composable(Screen.Food.route){
            FoodScreen(viewModel)
        }
    }

}