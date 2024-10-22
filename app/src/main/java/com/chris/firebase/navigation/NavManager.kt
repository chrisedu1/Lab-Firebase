package com.chris.firebase.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.chris.firebase.view.login.BlanckView
import com.chris.firebase.view.login.TabsView
import com.chris.firebase.view.notas.HomeView
import com.chris.firebase.viewmodel.LoginViewModel
import com.chris.firebase.viewmodel.NotesViewModel

@Composable
fun NavManager(loginViewModel: LoginViewModel,
               notesViewModel: NotesViewModel
){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "black"){
        composable("black") {
            BlanckView(navController = navController)
        }
        composable("login") {
            TabsView(navController = navController, loginViewModel = loginViewModel)
        }
        composable("home") {
            HomeView(navController = navController, viewModel = notesViewModel)
        }
    }
}