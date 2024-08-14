package com.tharwat.landmarks.presentation

import android.graphics.Bitmap

fun Bitmap.centerCrop(
    desiredWidth: Int,
    desiredHeight: Int
): Bitmap {
    val xStart = (width - desiredWidth) / 2f
    val yStart = (height - desiredHeight) / 2f
    if (xStart < 0 || yStart < 0 || desiredWidth > width || desiredHeight > height) {

        throw IllegalArgumentException("Desired width and height must be smaller than the original image")
    }
    return Bitmap.createBitmap(
        this,
        xStart.toInt(),
        yStart.toInt(),
        desiredWidth,
        desiredHeight
    )
}