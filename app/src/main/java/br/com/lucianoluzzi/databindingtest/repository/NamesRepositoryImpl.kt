package br.com.lucianoluzzi.databindingtest.repository

import br.com.lucianoluzzi.databindingtest.model.NameModel
import br.com.lucianoluzzi.databindingtest.repository.service.NamesService
import retrofit2.Retrofit

class NamesRepositoryImpl : NamesRepository {

    private val retrofit by lazy {
        getRetrofitClient()
    }

    private fun getRetrofitClient(): Retrofit {
        return with(Retrofit.Builder()) {
            baseUrl("https://autumn-sky-9358.getsandbox.com/")
            addConverterFactory(retrofit2.converter.gson.GsonConverterFactory.create())
            build()
        }
    }

    override fun getNames(): List<NameModel> {
        val create = retrofit.create(NamesService::class.java)
        val call = create.getNames()
        val body = call.execute().body()

        return body?.names ?: run {
            listOf<NameModel>()
        }
    }
}