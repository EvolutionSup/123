package com.example.artspaceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import com.example.artspaceapp.ui.theme.ArtSpaceAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArtSpace()
                }
            }
        }
    }
}

@Composable
fun ArtSpace() {
    var imageId by remember { mutableStateOf(1) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            fontSize = 30.sp,
            text = stringResource(R.string.author),
            modifier = Modifier
                .padding(10.dp)
        )
        DisplayArt(imageId)
        DisplayInfo(imageId)
        DisplayFooter(
            onAction = { action ->
                when (action) {
                    Action.PREVIOUS -> {
                        imageId = if (imageId == 1) 3 else imageId - 1
                    }
                    Action.NEXT -> {
                        imageId = if (imageId == 3) 1 else imageId + 1
                    }
                }
            }
        )
    }
}

enum class Action {
    PREVIOUS, NEXT
}

@Composable
fun DisplayArt(imageId: Int) {
    val image = painterResource(id = getImage(imageId))
    Image(painter = image, contentDescription = "")
}

@Composable
fun DisplayFooter(
    onAction: (Action) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        verticalAlignment  = Alignment.CenterVertically
    ) {
        androidx.compose.material3.Button(
            onClick = { onAction(Action.PREVIOUS) },
            modifier = Modifier.padding(8.dp)
        ) {
            Text(text = "Previous")
        }
        androidx.compose.material3.Button(
            onClick = { onAction(Action.NEXT) },
            modifier = Modifier.padding(8.dp)
        ) {
            Text(text = "Next")
        }
    }
}

@Composable
fun DisplayInfo(imageId: Int,modifier: Modifier = Modifier) {
    Column(
        verticalArrangement  = Arrangement.Center,
        horizontalAlignment  = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()

    ) {
        Text(
            fontSize = 23.sp,
            fontWeight = FontWeight.Bold,
            text = stringResource(id = getTitle(imageId)),
            modifier = modifier
                .padding(10.dp)
        )
        Text(
            text = stringResource(id = getYear(imageId)) ,
            fontSize = 18.sp,
            fontStyle = FontStyle.Italic,
            modifier = modifier
                .padding(bottom = 10.dp)
        )
    }
}

private fun getImage(imageId: Int):Int{
    return when(imageId){
        1 -> R.drawable.image1
        2 -> R.drawable.image2
        else -> R.drawable.image3
    }
}

private fun getYear(imageId: Int):Int{
    return when(imageId){
        1 -> R.string.year1
        2 -> R.string.year2
        else -> R.string.year3
    }
}

private fun getTitle(imageId: Int):Int{
    return when(imageId){
        1 -> R.string.title1
        2 -> R.string.title2
        else -> R.string.title3
    }
}

@Preview(showBackground = true)
@Composable
fun ArtSpaceAppPreview() {
    ArtSpace()
}