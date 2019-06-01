package br.com.lucianoluzzi.databindingtest.model

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import br.com.lucianoluzzi.databindingtest.R
import br.com.lucianoluzzi.databindingtest.databinding.NameItemBinding

class NamesAdapter(private val context: Context, private val names: List<NameModel>) :
    RecyclerView.Adapter<NameViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameViewHolder {
        val layoutInflater = LayoutInflater.from(context)
        val binding = DataBindingUtil.inflate<NameItemBinding>(layoutInflater, R.layout.name_item, parent, false)
        return NameViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return names.size
    }

    override fun onBindViewHolder(holder: NameViewHolder, position: Int) {
        holder.setName(names[position])
    }
}