package com.example.artspaceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceApp()
        }
    }
}

@Composable
fun ArtSpaceApp() {
    var currentArtwork by remember { mutableStateOf(0) }
    val artworks = listOf(
        Artwork("Title 1", "Artist 1", "Year 1", R.drawable.image1),
        Artwork("Title 2", "Artist 2", "Year 2", R.drawable.image2),
        Artwork("Title 3", "Artist 3", "Year 3", R.drawable.image3)
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        ArtworkWall(artworks[currentArtwork].imageRes)
        ArtworkDescriptor(artworks[currentArtwork].title, artworks[currentArtwork].artist, artworks[currentArtwork].year)
        DisplayController(
            onPrevious = { currentArtwork = (currentArtwork - 1 + artworks.size) % artworks.size },
            onNext = { currentArtwork = (currentArtwork + 1) % artworks.size }
        )
    }
}

@Composable
fun ArtworkWall(imageRes: Int) {
    Image(
        painter = painterResource(id = imageRes),
        contentDescription = null,
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),
        contentScale = ContentScale.Crop
    )
}

@Composable
fun ArtworkDescriptor(title: String, artist: String, year: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp)
    ) {
        Text(text = "Title: $title", style = MaterialTheme.typography.titleMedium)
        Text(text = "Artist: $artist", style = MaterialTheme.typography.bodyLarge)
        Text(text = "Year: $year", style = MaterialTheme.typography.bodyLarge)
    }
}

@Composable
fun DisplayController(onPrevious: () -> Unit, onNext: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Button(onClick = onPrevious) {
            Text("Previous")
        }
        Button(onClick = onNext) {
            Text("Next")
        }
    }
}

data class Artwork(val title: String, val artist: String, val year: String, val imageRes: Int)

@Preview(showBackground = true)
@Composable
fun ArtSpaceAppPreview() {
    ArtSpaceApp()
}