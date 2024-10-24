package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFF6A5ACD)
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun AndroidLogo(modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.android_logo)
    Image(
        painter = image,
        contentDescription ="android logo",
        modifier = modifier
            .size(150.dp)
            .background(Color(0xFF405060))
    )
}

@Composable
fun Intro(name: Int, occupation: Int, modifier: Modifier = Modifier){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(name),
            color = Color(0xFF3DDC84),
            fontWeight = FontWeight.Bold,
            fontSize = 40.sp,
            modifier = modifier.padding(8.dp)

        )
        Text(
            text = stringResource(occupation),
            color = Color(0xFFFFFFFF),
            fontSize = 20.sp,
            modifier = modifier
        )
    }
}

@Composable
fun ContactDetails(phone: Int, email: Int, modifier: Modifier = Modifier){
    Text(
        text = stringResource(phone),
        color = Color(0xFFFFFFFF),
        fontSize = 16.sp,
        modifier = modifier
    )
    Text(
        text = stringResource(email),
        color = Color(0xFFFFFFFF),
        fontSize = 16.sp,
        modifier = modifier
    )
}

@Composable
fun BusinessCard( modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
    ) {
        Column  (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .fillMaxHeight(0.5F)
        ) {
            AndroidLogo()
            Intro(name = R.string.user_name, occupation = R.string.occupation)
        }
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .padding(bottom = 20.dp)
        ) {
            ContactDetails(phone = R.string.phone, email = R.string.email)
        }
    }


}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color(0xFF6A5ACD)
        ) {
            BusinessCard()
        }
    }
}