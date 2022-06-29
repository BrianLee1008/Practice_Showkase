package com.example.showkase.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.airbnb.android.showkase.annotation.ShowkaseTypography

// ERNote 5
@ShowkaseTypography(name = "displayLarge", group = "Material Design Style")
val displayLarge = TextStyle(
    fontWeight = FontWeight.W400,
    fontSize = 57.sp,
    lineHeight = 64.sp,
    letterSpacing = (-0.25).sp,
    color = Color.Blue
)