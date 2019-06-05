package br.com.lucianoluzzi.databindingtest.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.lucianoluzzi.databindingtest.repository.NamesRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class NameViewModel(private val namesRepository: NamesRepository) : ViewModel() {
    private val _names = MutableLiveData<List<NameModel>>().apply {
        listOf<NameModel>()
    }
    val names: LiveData<List<NameModel>> by lazy {
        _names
    }

    suspend fun fetchNames() = withContext(Dispatchers.IO) {
        _names.postValue(namesRepository.getNames())
    }
}
