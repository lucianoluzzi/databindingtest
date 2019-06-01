package br.com.lucianoluzzi.databindingtest.view.adapters

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import br.com.lucianoluzzi.databindingtest.model.NameModel
import br.com.lucianoluzzi.databindingtest.model.NamesAdapter

@BindingAdapter("names", requireAll = false)
fun RecyclerView.setNames(names: List<NameModel>) {
    val adapter = NamesAdapter(this.context, names)
    this.adapter = adapter
}