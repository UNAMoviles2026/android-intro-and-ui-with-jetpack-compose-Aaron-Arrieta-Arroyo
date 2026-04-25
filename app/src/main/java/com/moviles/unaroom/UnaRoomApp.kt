package com.moviles.unaroom

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.moviles.unaroom.navigation.AppNavHost
import com.moviles.unaroom.ui.theme.UnaRoomTheme

@Composable
fun UnaRoomApp() {
    UnaRoomTheme {
        AppNavHost(modifier = Modifier.fillMaxSize())
    }
}
