package com.example.myapplication.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myapplication.Screen

@Composable
fun HomeScreen(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)

    ){
        Button(onClick = {navController.navigate(Screen.Monuments.route) },
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .height(60.dp),
            shape = RoundedCornerShape(16.dp)) {
            Text("Must-See Monuments")
        }
        Spacer(modifier = Modifier.height(24.dp))

        Button(onClick = {navController.navigate(Screen.Museums.route) },
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .height(60.dp),
            shape = RoundedCornerShape(16.dp)) {
            Text("Educational Museums")
        }
        Spacer(modifier = Modifier.height(24.dp))

        Button(onClick = {navController.navigate(Screen.Parks.route) },
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .height(60.dp),
            shape = RoundedCornerShape(16.dp)) {
            Text("Relax with nature")
        }
        Spacer(modifier = Modifier.height(24.dp))

        Button(onClick = {navController.navigate(Screen.Food.route)},
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .height(60.dp),
            shape = RoundedCornerShape(16.dp)){
            Text("Food in Rome")
        }
        Spacer(modifier = Modifier.height(24.dp))
    }


}