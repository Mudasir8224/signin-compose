package com.example.loginco

sealed class Routes(val route:String){
    object Welcome: Routes("welcome")
    object SignIn: Routes("signin")
}
