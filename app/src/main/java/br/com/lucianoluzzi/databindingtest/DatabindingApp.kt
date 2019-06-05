package br.com.lucianoluzzi.databindingtest

import android.app.Application
import br.com.lucianoluzzi.databindingtest.model.NameViewModel
import br.com.lucianoluzzi.databindingtest.repository.NamesRepositoryImpl
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

class DatabindingApp : Application() {
    private val module = module {
        single {
            NamesRepositoryImpl()
        }

        viewModel {
            NameViewModel(NamesRepositoryImpl())
        }
    }

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(module)
        }
    }
}