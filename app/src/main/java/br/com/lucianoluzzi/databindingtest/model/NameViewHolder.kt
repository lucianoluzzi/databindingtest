package br.com.lucianoluzzi.databindingtest.model

import androidx.recyclerview.widget.RecyclerView
import br.com.lucianoluzzi.databindingtest.databinding.NameItemBinding

class NameViewHolder(private val binding: NameItemBinding) : RecyclerView.ViewHolder(binding.root) {
    fun setName(name: NameModel) {
        binding.setName(name)
    }
}