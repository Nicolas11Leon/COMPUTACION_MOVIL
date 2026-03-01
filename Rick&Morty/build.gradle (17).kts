package com.example.rickandmortyapp

import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

// COLORES ESTILO "MOUNTAIN DEW" (Basados en tu imagen)
val NeuBackground = Color(0xFFEDF1F5)
val NeuLightShadow = Color.White
val NeuDarkShadow = Color(0xFFA3B1C6).copy(alpha = 0.6f)
val NeuAccent = Color(0xFF00E5FF) // El cyan brillante del nombre
val DeepSpace = Color(0xFF202329) // Gris oscuro para los textos

fun Modifier.neumorphicShadow(
    alpha: Float = 0.2f,
    borderRadius: Dp = 0.dp,
    shadowRadius: Dp = 8.dp,
    offsetY: Dp = 4.dp,
    offsetX: Dp = 4.dp,
    color: Color = NeuDarkShadow
) = this.drawBehind {
    val shadowColor = color.copy(alpha = alpha).toArgb()
    val transparentColor = color.copy(alpha = 0f).toArgb()

    drawIntoCanvas {
        val paint = Paint()
        val frameworkPaint = paint.asFrameworkPaint()
        frameworkPaint.color = transparentColor
        frameworkPaint.setShadowLayer(
            shadowRadius.toPx(),
            offsetX.toPx(),
            offsetY.toPx(),
            shadowColor
        )
        it.drawRoundRect(
            0f,
            0f,
            this.size.width,
            this.size.height,
            borderRadius.toPx(),
            borderRadius.toPx(),
            paint
        )
    }
}