package br.com.lucianoluzzi.databindingtest.model

import androidx.lifecycle.ViewModel

class NameViewModel : ViewModel() {
    val names: List<NameModel> = listOf(
        NameModel("Luciano", "Pavarotti", "Luzzi"),
        NameModel("Virgínia", "Lima", "Tarouco"),
        NameModel("Zuleica", "Beatriz", "Luzzi")
    )
}
