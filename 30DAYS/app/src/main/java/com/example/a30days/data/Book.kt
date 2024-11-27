package com.example.a30days.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.a30days.R

data class Book(
    @StringRes val titleRes: Int,
    @StringRes val descrRes: Int,
    @DrawableRes val imageRes: Int
)

val books = listOf(
    Book(
        titleRes = R.string.day_1_title,
        imageRes = R.drawable.day_1_img,
        descrRes = R.string.day_1_description
    ),
    Book(
        titleRes = R.string.day2title,
        imageRes = R.drawable.day_2_img,
        descrRes = R.string.day2description
    ),
    Book(
        titleRes = R.string.day_3_title,
        imageRes = R.drawable.day_3_img,
        descrRes = R.string.day3description
    ),
    Book(
        titleRes = R.string.day4title,
        imageRes = R.drawable.day_4_img,
        descrRes = R.string.day4description
    ),
    Book(
        titleRes = R.string.day5title,
        imageRes = R.drawable.day_5_img,
        descrRes = R.string.day5description
    ),
    Book(
        titleRes = R.string.day6title,
        imageRes = R.drawable.day_6_img,
        descrRes = R.string.day6description
    ),
    Book(
        titleRes = R.string.day7title,
        imageRes = R.drawable.day_7_img,
        descrRes = R.string.day7description
    ),
    Book(
        titleRes = R.string.day8title,
        imageRes = R.drawable.day_8_img,
        descrRes = R.string.day8description
    ),
    Book(
        titleRes = R.string.day9title,
        imageRes = R.drawable.day_9_img,
        descrRes = R.string.day9description
    ),
    Book(
        titleRes = R.string.day10title,
        imageRes = R.drawable.day_10_img,
        descrRes = R.string.day10description
    ),
    Book(
        titleRes = R.string.day11title,
        imageRes = R.drawable.day_11_img,
        descrRes = R.string.day11description
    ),
    Book(
        titleRes = R.string.day12title,
        imageRes = R.drawable.day_12_img,
        descrRes = R.string.day12description
    ),
    Book(
        titleRes = R.string.day13title,
        imageRes = R.drawable.day_13_img,
        descrRes = R.string.day13description
    ),
    Book(
        titleRes = R.string.day14title,
        imageRes = R.drawable.day_14_img,
        descrRes = R.string.day14description
    ),
    Book(
        titleRes = R.string.day15title,
        imageRes = R.drawable.day_15_img,
        descrRes = R.string.day15description
    ),
    Book(
        titleRes = R.string.day16title,
        imageRes = R.drawable.day_16_img,
        descrRes = R.string.day16description
    ),
    Book(
        titleRes = R.string.day17title,
        imageRes = R.drawable.day_17_img,
        descrRes = R.string.day17description
    ),
    Book(
        titleRes = R.string.day18title,
        imageRes = R.drawable.day_18_img,
        descrRes = R.string.day18description
    ),
    Book(
        titleRes = R.string.day19title,
        imageRes = R.drawable.day_19_img,
        descrRes = R.string.day19description
    ),
    Book(
        titleRes = R.string.day20title,
        imageRes = R.drawable.day_20_img,
        descrRes = R.string.day20description
    ),
    Book(
        titleRes = R.string.day21title,
        imageRes = R.drawable.day_21_img,
        descrRes = R.string.day21description
    ),
    Book(
        titleRes = R.string.day22title,
        imageRes = R.drawable.day_22_img,
        descrRes = R.string.day22description
    ),
    Book(
        titleRes = R.string.day23title,
        imageRes = R.drawable.day_23_img,
        descrRes = R.string.day23description
    ),
    Book(
        titleRes = R.string.day24title,
        imageRes = R.drawable.day_24_img,
        descrRes = R.string.day24description
    ),
    Book(
        titleRes = R.string.day25title,
        imageRes = R.drawable.day_26_img,
        descrRes = R.string.day25description
    ),
    Book(
        titleRes = R.string.day26title,
        imageRes = R.drawable.day_26_img,
        descrRes = R.string.day26description
    ),
    Book(
        titleRes = R.string.day27title,
        imageRes = R.drawable.day_27_img,
        descrRes = R.string.day27description
    ),
    Book(
        titleRes = R.string.day28title,
        imageRes = R.drawable.day_28_img,
        descrRes = R.string.day28description
    ),
    Book(
        titleRes = R.string.day29title,
        imageRes = R.drawable.day_29_img,
        descrRes = R.string.day29description
    ),
    Book(
        titleRes = R.string.day30title,
        imageRes = R.drawable.day_30_img,
        descrRes = R.string.day30description
    )
)