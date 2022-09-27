package com.example.thursdaytrivia2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.thursdaytrivia2.ui.theme.ThursdayTrivia2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThursdayTrivia2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainContentPreview()
                }
            }
        }
    }
}

@Preview
@Composable
fun MainContentPreview() {
    MainContent(
        Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.TopCenter))
}

@Composable
fun MainContent(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.hand),
            contentDescription = null
        )
        Spacer(Modifier.height(16.dp))
        Text(text = stringResource(id = R.string.score), fontSize = 30.sp)
        Text(text = stringResource(id = R.string.scoreAchieve), fontSize = 50.sp)
        Spacer(Modifier.height(16.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 100.dp)
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = stringResource(id = R.string.you),
                    fontSize = 16.sp
                )
                Text(
                    text = stringResource(id = R.string.rock),
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = stringResource(id = R.string.android), fontSize = 16.sp)
                Text(text = stringResource(id = R.string.paper), fontSize = 32.sp, fontWeight = FontWeight.Bold)
            }
        }
        Row(
            horizontalArrangement = Arrangement.SpaceAround, modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp, top = 100.dp)
        ) {
            Button(
                onClick = {},
                modifier = Modifier.size(100.dp),
                shape = RoundedCornerShape(10.dp)
            ) {
                Text(stringResource(id = R.string.rock))
            }
            Button(
                onClick = {},
                modifier = Modifier.size(100.dp),
                shape = RoundedCornerShape(10.dp)
            ) {
                Text(stringResource(id = R.string.paper))
            }
            Button(
                onClick = {},
                modifier = Modifier.size(100.dp),
                shape = RoundedCornerShape(10.dp)
            ) {
                Text(stringResource(id = R.string.scissors))
            }
        }
        Text(
            text = stringResource(id = R.string.jetpackCompose),
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 20.dp)
        )
    }
}