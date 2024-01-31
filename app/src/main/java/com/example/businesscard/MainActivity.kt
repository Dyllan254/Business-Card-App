package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
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
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard( modifier: Modifier = Modifier) {
    Column( verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    modifier = Modifier
        .fillMaxSize()
        .background(color = Color(0xFFD2E8D4))
    )
    {
        AndroidLogo()
        Spacer(modifier = modifier.height(200.dp))
        InfoIcons()
    }

}
@Composable
fun AndroidLogo() {
    val image = painterResource(id = R.drawable.android_logo)
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Image(
            painter = image,
            contentDescription = null,
            Modifier.background(color = Color(0xFF073042))
        )
        Text(
            text = stringResource(R.string.name), color = Color(0xD9000000),
            fontSize = 40.sp,
        )

        Text(
            text = stringResource(R.string.description),
            color = Color(0xFF006D3B),
            fontWeight = FontWeight.Bold,
            fontSize = 15.sp)
    }
}

@Composable
fun InfoIcons() {
    Column(
        modifier = Modifier
    ) {
        Row(modifier = Modifier
            .padding(5.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                Icons.Default.Call,
                contentDescription = null,
                tint = Color(0xFF006D3B)
            )
            Text(
                text = stringResource(R.string.phone_number),
                modifier = Modifier.padding(start = 15.dp),
                fontSize = 15.sp
            )
        }
        Row(modifier = Modifier
            .padding(5.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                Icons.Default.Share,
                contentDescription = null,
                tint = Color(0xFF006D3B)
            )
            Text(
                text = stringResource(R.string.twitter),
                modifier = Modifier.padding(start = 15.dp),
                fontSize = 15.sp
            )
        }
        Row(modifier = Modifier
            .padding(5.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                Icons.Default.Email,
                contentDescription = null,
                tint = Color(0xFF006D3B),

            )
            Text(
                text = stringResource(R.string.email),
                fontSize = 15.sp,
                modifier = Modifier.padding(start = 15.dp)

            )
        }
    }

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        BusinessCard()
    }
}