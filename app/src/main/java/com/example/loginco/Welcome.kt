package com.example.loginco


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.loginco.ui.theme.LoginCoTheme
import com.example.loginco.ui.theme.Typography


@Composable
fun Welcome(navController: NavHostController) {
    Column(
        modifier = Modifier
            .padding(14.dp)
            .fillMaxWidth()
    ) {
        Card(
            elevation = 4.dp,
            backgroundColor = Color(244, 105, 104),
            modifier = Modifier
                .clip(shape = RoundedCornerShape(16.dp))
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_welcome),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(240.dp),
            )
        }

        Text(
            text = "Discover Your",
            fontFamily = FontFamily.SansSerif,
            style = Typography.h5,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 60.dp)
        )
        Text(
            text = "Dream Job Here",
            fontFamily = FontFamily.SansSerif,
            style = Typography.h5,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
        )
        Text(
            text = "Explore all the most existing jobs roles",
            style = Typography.body1,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
        )
        Text(
            text = "based on your interest and study major",
            style = Typography.body1,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 120.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(244, 105, 104)),
                modifier = Modifier
                    .width(110.dp)
                    .height(40.dp)
            ) {
                Text(text = "Register",
                color = Color.White)
            }
            Button(
                onClick = {
                    navController.navigate(Routes.SignIn.route) {
                    }
                },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(244, 105, 104)),
                modifier = Modifier
                    .width(110.dp)
                    .height(40.dp)
                //.padding(start = 10.dp)
            ) {
                Text(text = "Sign In",
                color = Color.White)
            }
        }

    }
}


@Preview(showBackground = true)
@Composable
fun WelcomePreview() {
    LoginCoTheme {
        Welcome(navController = rememberNavController())
    }
}