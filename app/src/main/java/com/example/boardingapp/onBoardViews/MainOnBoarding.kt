package com.example.boardingapp.onBoardViews

import android.graphics.pdf.PdfDocument.Page
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.boardingapp.R
import com.example.boardingapp.data.PageData
import com.example.boardingapp.dataStore.StoreBoarding
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState

@OptIn(ExperimentalPagerApi::class,
    ExperimentalFoundationApi::class)
@Composable
fun MainOnBoarding(navController: NavController, store: StoreBoarding) {
    val items = ArrayList<PageData>()

    items.add(
        PageData(
            R.raw.car,
            "Titulo 1",
            "Descripcion 1"
        )
    )
    items.add(
        PageData(
            R.raw.welcome,
            "titulo 2",
            "Descripcion 2"
        )
    )
    items.add(
        PageData(
            R.raw.car,
            "titulo 3",
            "descripcion 3"
        )
    )

    val pagerState = rememberPagerState(
        pageCount = items.size,
        initialOffscreenLimit = 2,
        infiniteLoop = false,
        initialPage = 0
        )
    
    OnBoardingPage(item = items, pagerState = pagerState, modifier = Modifier
        .fillMaxWidth()
        .background(Color.White), navController, store )

}