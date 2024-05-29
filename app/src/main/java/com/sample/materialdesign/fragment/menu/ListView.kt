package com.sample.materialdesign.fragment.menu

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.sample.materialdesign.R
import com.sample.materialdesign.datamodel.CardItem

class CardAdapter(private val context: Context, private val dataSource: List<CardItem>) : BaseAdapter() {

    private val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int {
        return dataSource.size
    }

    override fun getItem(position: Int): Any {
        return dataSource[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view: View = convertView ?: inflater.inflate(R.layout.item_card, parent, false)

        val titleTextView = view.findViewById<TextView>(R.id.textViewTitle)
        val descriptionTextView = view.findViewById<TextView>(R.id.textViewDescription)

        val cardItem = getItem(position) as CardItem

        titleTextView.text = cardItem.title
        descriptionTextView.text = cardItem.description

        return view
    }
}