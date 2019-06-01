package br.com.lucianoluzzi.databindingtest.model

import androidx.lifecycle.ViewModel

class NameViewModel : ViewModel() {
    private val names: MutableList<NameModel> = mutableListOf()

    fun getNames(): List<NameModel> {
        return listOf(
            NameModel("Luciano", "Pavarotti", "Luzzi"),
            NameModel("Virgínia", "Lima", "Tarouco"),
            NameModel("Zuleica", "Beatriz", "Luzzi")
        )
    }
}
