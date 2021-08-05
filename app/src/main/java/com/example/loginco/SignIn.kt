package com.example.loginco


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.loginco.ui.theme.LoginCoTheme
import com.example.loginco.ui.theme.Typography


@Composable
fun SignIn() {
    Column(
        modifier = Modifier
            .padding(24.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = "Hello Again!",
            textAlign = TextAlign.Center,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold,
            style = Typography.h4,
            modifier = Modifier.fillMaxWidth()
        )

        Text(
            text = "Welcome back you you've",
            fontFamily = FontFamily.SansSerif,
            style = Typography.h5,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
        )
        Text(
            text = "been missed!",
            fontFamily = FontFamily.SansSerif,
            style = Typography.h5,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 4.dp)
        )

        var text by remember { mutableStateOf("") }
        TextField(
            value = text,
            onValueChange = { text = it },
            label = { Text(text = "Username") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 50.dp)
        )

        var password by remember { mutableStateOf("") }
        TextField(
            value = password,
            onValueChange = { password = it },
            label = { Text(text = "Password") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
        )

        Text(
            text = "Recovery Password",
            style = Typography.subtitle1,
            textAlign = TextAlign.End,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp)
        )

        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(244, 105, 104),
                Color.White
            ),
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .padding(top = 40.dp),

            ) {
            Text(
                text = "Sign In",
                fontWeight = FontWeight.Bold,
                style = Typography.h6,
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 50.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Divider(
                modifier = Modifier
                    .weight(1f),
                color = Color.LightGray,
                thickness = 2.dp
            )
            Text(
                text = "Or continue with",
                fontFamily = FontFamily.SansSerif,
                style = Typography.subtitle2,
                modifier = Modifier
                    .padding(start = 6.dp, end = 6.dp)
                    .weight(1f)
            )
            Divider(
                modifier = Modifier
                    .weight(1f),
                color = Color.LightGray,
                thickness = 2.dp
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 50.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Box(
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(10.dp))
                    .border(
                        border =
                        BorderStroke(width = 2.dp, color = Color.LightGray)
                    )
                    .width(90.dp)
                    .height(60.dp),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_google),
                    contentDescription = null,
                    modifier = Modifier
                        .width(30.dp)
                        .height(30.dp),
                )
            }

            Box(
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(10.dp))
                    .border(
                        border =
                        BorderStroke(width = 2.dp, color = Color.LightGray)
                    )
                    .width(90.dp)
                    .height(60.dp),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_facebook),
                    contentDescription = null,
                    modifier = Modifier
                        .width(30.dp)
                        .height(30.dp),
                )
            }

            Box(
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(10.dp))
                    .border(
                        border =
                        BorderStroke(width = 2.dp, color = Color.LightGray)
                    )
                    .width(90.dp)
                    .height(60.dp),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_twitter),
                    contentDescription = null,
                    modifier = Modifier
                        .width(30.dp)
                        .height(30.dp),
                )
            }

        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp),
            horizontalArrangement = Arrangement.Center

        ) {
            Text(
                text = "Not a member?",
                fontFamily = FontFamily.SansSerif,
                style = Typography.subtitle2,
                modifier = Modifier
                    .padding(end = 6.dp)
            )

            Text(
                text = "Register now",
                fontFamily = FontFamily.SansSerif,
                style = Typography.subtitle2
                    .merge(TextStyle(color = Color(244, 105, 104))),
                modifier = Modifier
                    .padding(end = 6.dp)
            )
        }

    }

}

@Preview(showBackground = true)
@Composable
fun SignInPreview() {
    LoginCoTheme {
        SignIn()
    }
}

