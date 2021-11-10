package com.squaredcandy.lunar.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.squaredcandy.lunar.R

object LunarType {
    val roboto = FontFamily(
        Font(
            R.font.roboto_slab_thin,
            FontWeight.Thin,
        ),
        Font(
            R.font.roboto_slab_extralight,
            FontWeight.ExtraLight,
        ),
        Font(
            R.font.roboto_slab_light,
            FontWeight.Light,
        ),
        Font(
            R.font.roboto_slab_regular,
            FontWeight.Normal,
        ),
        Font(
            R.font.roboto_slab_medium,
            FontWeight.Medium,
        ),
        Font(
            R.font.roboto_slab_semibold,
            FontWeight.SemiBold,
        ),
        Font(
            R.font.roboto_slab_bold,
            FontWeight.Bold,
        ),
        Font(
            R.font.roboto_slab_extrabold,
            FontWeight.ExtraBold,
        ),
        Font(
            R.font.roboto_slab_black,
            FontWeight.Black,
        ),
    )

    val typography = Typography(
        defaultFontFamily = roboto,
    )
}
