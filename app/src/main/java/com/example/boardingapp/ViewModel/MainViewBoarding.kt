package com.example.boardingapp.ViewModel

import androidx.compose.runtime.Composable
import com.example.boardingapp.R
import com.example.boardingapp.data.PageData

@Composable
fun MainViewBoarding()
{
    val items = ArrayList<PageData>()
    items.add(
        PageData(
            R.raw.car,
                "Bien venido seas aqui!",
                "Aplicacion para no se que",

        )
    )

    items.add(
        PageData(
            R.raw.welcome,
            "Uso de onBoarding",
            "Está es la segunda página del Boarding mostrando una descripción",

            )
    )

    items.add(
        PageData(
            R.raw.car,
            "Fin del Boarding",
            "Esta es la página final del Boarding y ya debe de aparecer el botón"
        )
    )


}