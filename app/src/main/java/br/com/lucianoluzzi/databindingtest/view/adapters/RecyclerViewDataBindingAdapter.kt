package br.com.lucianoluzzi.databindingtest.view.adapters

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.lucianoluzzi.databindingtest.model.NameModel
import br.com.lucianoluzzi.databindingtest.view.NamesAdapter

@BindingAdapter("names", requireAll = false)
fun RecyclerView.setNames(names: List<NameModel>?) {
    this.adapter = names?.let {
        NamesAdapter(context, names)
    } ?: run {
        NamesAdapter(context, listOf())
    }
    layoutManager = LinearLayoutManager(context)
}