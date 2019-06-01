package br.com.lucianoluzzi.databindingtest.view.binding_adapters

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import br.com.lucianoluzzi.databindingtest.model.NameModel
import br.com.lucianoluzzi.databindingtest.model.NamesAdapter

@BindingAdapter("names", requireAll = false)
fun RecyclerView.setNames(names: List<NameModel>) {
    names?.let {
        val adapter = NamesAdapter(this.context, it)
        this.adapter = adapter
    }
}