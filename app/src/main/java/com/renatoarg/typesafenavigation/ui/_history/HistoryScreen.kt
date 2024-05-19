package com.renatoarg.typesafenavigation.ui._history

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import androidx.navigation.toRoute
import com.renatoarg.typesafenavigation.HistoryScreen

@Composable
fun HistoryScreen(
    navController: NavController,
    navBackStackEntry: NavBackStackEntry
) {
    val args = navBackStackEntry.toRoute<HistoryScreen>()
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "History Screen")
        Button(onClick = { navController.navigateUp() } ) {
            Text(text = "Go to Home Screen\n${args.name}, ${args.age} years old.")
        }
    }
}