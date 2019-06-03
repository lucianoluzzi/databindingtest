package br.com.lucianoluzzi.databindingtest.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NameViewModel : ViewModel() {
    private val _names = MutableLiveData<List<NameModel>>().apply {
        listOf<NameModel>()
    }
    val names: LiveData<List<NameModel>> by lazy {
        _names
    }

    fun fetchNames() {
        val names = listOf(
            NameModel("Luciano", "Pavarotti", "Luzzi"),
            NameModel("Zuleica", "Beatriz", "Luzzi"),
            NameModel("Virgínia", "Lima", "Tarouco")
        )
        _names.postValue(names)
    }
}
