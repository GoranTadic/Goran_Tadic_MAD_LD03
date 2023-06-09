package com.example.goran_tadic_mad_ld3.ui.theme.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.goran_tadic_mad_ld3.ui.theme.models.Movie
import com.example.goran_tadic_mad_ld3.ui.theme.models.getMovies
import com.example.goran_tadic_mad_ld3.ui.theme.widgets.MovieRow


@Preview(showBackground = true)
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun FavoritesScreen(navController: NavController = rememberNavController() ){



    Scaffold(topBar = {
        TopAppBar(backgroundColor = Color.Cyan, elevation = 3.dp) {
            Row() {
                Icon(imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Arrow back",
                    modifier = Modifier.clickable {
                        navController.popBackStack()
                    })
                Spacer(modifier = Modifier.width(20.dp))
                Text(text = "My Favorite Movies", style = MaterialTheme.typography.h6)
            }
        }
    }
    ){
        Content()
    }
}

@Composable
fun Content (movies: List<Movie> = getMovies()){
    LazyColumn {
        items(movies) {movie ->
            MovieRow(movie = movie)
        }
    }
}