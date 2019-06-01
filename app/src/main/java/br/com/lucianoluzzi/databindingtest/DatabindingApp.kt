package br.com.lucianoluzzi.databindingtest

import android.app.Application
import br.com.lucianoluzzi.databindingtest.model.NameViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

class DatabindingApp : Application() {
    private val module = module {
        viewModel {
            NameViewModel()
        }
    }

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(module)
        }
    }
}