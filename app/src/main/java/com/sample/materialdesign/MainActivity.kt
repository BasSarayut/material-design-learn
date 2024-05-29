package com.sample.materialdesign

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.sample.materialdesign.datamodel.CardItem
import com.sample.materialdesign.fragment.menu.CardAdapter


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)

        val cardItems = listOf(
            CardItem("Title 1", "Description 1"),
            CardItem("Title 2", "Description 2"),
            CardItem("Title 3", "Description 3"),
            // Add more items here
        )

        val adapter = CardAdapter(this, cardItems)
        listView.adapter = adapter
    }
}