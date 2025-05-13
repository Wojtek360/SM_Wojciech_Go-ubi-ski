package com.example.superheroes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.superheroes.model.Hero
import com.example.superheroes.model.HeroesRepository

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SuperheroesTopAppBar(){
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = stringResource(id = R.string.app_name),
                style = MaterialTheme.typography.displayLarge
            )
        }
    )

}

@Composable
fun HeroListItem(hero: Hero, modifier: Modifier = Modifier){

    Card(modifier = modifier
        .padding(16.dp)
        .fillMaxWidth()
        .height(72.dp),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ){
        Row(modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
        ){
            Image(
                painter = painterResource(id = hero.imageRes),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(72.dp)
                    .clip(RoundedCornerShape(8.dp))
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column(
                modifier = Modifier
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center

            ){
                Text(
                    text = stringResource(id = hero.nameRes),
                    style = MaterialTheme.typography.displaySmall

                )
                Text(
                    text = stringResource(id = hero.descriptionRes),
                    style = MaterialTheme.typography.bodyLarge

                )

            }
        }


    }



}

@Composable
fun HeroesListScreen() {
    Scaffold(
        topBar = { SuperheroesTopAppBar() }
    ) { innerPadding ->
        LazyColumn(
            contentPadding = innerPadding
        ) {
            items(HeroesRepository.heroes) { hero ->
                HeroListItem(hero = hero)
            }
        }
    }
}

