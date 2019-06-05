package br.com.lucianoluzzi.databindingtest.repository.service

import br.com.lucianoluzzi.databindingtest.repository.dto.NamesResponseDTO
import retrofit2.Call
import retrofit2.http.GET

interface NamesService {
    @GET("names")
    fun getNames(): Call<NamesResponseDTO>
}