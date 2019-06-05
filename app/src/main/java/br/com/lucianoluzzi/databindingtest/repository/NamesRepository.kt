package br.com.lucianoluzzi.databindingtest.repository

import br.com.lucianoluzzi.databindingtest.model.NameModel

interface NamesRepository {
    fun getNames(): List<NameModel>
}