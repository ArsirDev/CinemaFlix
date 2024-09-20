package com.arsir.splash_screen.screen.section

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.arsir.splash_screen.R

@Composable
internal fun SplashSection(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(R.drawable.img_splash_screen),
            contentDescription = "Image Splash Screen"
        )
    }
}

@Preview
@Composable
private fun SplashSectionPreview() {
    SplashSection()
}