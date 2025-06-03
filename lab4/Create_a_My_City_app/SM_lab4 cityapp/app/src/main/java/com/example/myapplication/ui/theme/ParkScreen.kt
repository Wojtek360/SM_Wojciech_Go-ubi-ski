package com.example.myapplication.ui.theme

import com.example.myapplication.data.Recommendation
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapplication.viewmodel.RomeViewModel
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.foundation.shape.RoundedCornerShape

@Composable
fun ParksScreen(viewModel : RomeViewModel) {
    val parks by viewModel.parks.collectAsState()

    LazyColumn {
        items(parks) { item: Recommendation ->
            val elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
            Card(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                elevation = elevation
            ) {
                Column {
                    Image(
                        painter = painterResource(id = item.imageResId),
                        contentDescription = item.title,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp),
                        contentScale = ContentScale.Crop // Crop to fill
                    )
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(text = item.title, style = MaterialTheme.typography.titleMedium)
                        Text(text = item.description, style = MaterialTheme.typography.bodyMedium)
                    }

                }

            }

        }

    }
}