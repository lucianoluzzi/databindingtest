package br.com.lucianoluzzi.databindingtest.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.viewModelScope
import br.com.lucianoluzzi.databindingtest.R
import br.com.lucianoluzzi.databindingtest.databinding.ActivityMainBinding
import br.com.lucianoluzzi.databindingtest.model.NameViewModel
import kotlinx.coroutines.launch
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    private val nameViewModel: NameViewModel by viewModel()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = nameViewModel
        binding.lifecycleOwner = this
    }

    override fun onResume() {
        super.onResume()
        getNames()
    }

    private fun getNames() {
        nameViewModel.viewModelScope.launch {
            nameViewModel.fetchNames()
        }
    }
}
