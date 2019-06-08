package br.com.lucianoluzzi.databindingtest.view

import androidx.recyclerview.widget.RecyclerView
import br.com.lucianoluzzi.databindingtest.databinding.NameItemBinding
import br.com.lucianoluzzi.databindingtest.model.NameModel

class NameViewHolder(private val binding: NameItemBinding) : RecyclerView.ViewHolder(binding.root) {
    fun setName(name: NameModel) {
        binding.setName(name)
    }
}