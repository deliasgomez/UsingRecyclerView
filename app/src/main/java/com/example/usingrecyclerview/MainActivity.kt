package com.example.usingrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.usingrecyclerview.data.DataSource
import com.example.usingrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myDataSet = DataSource.affirmations
        val manager = LinearLayoutManager(this)
        val decoration = DividerItemDecoration(this,manager.orientation)
        binding.recyclerView.layoutManager = manager
        binding.recyclerView.adapter = ItemAdapter(myDataSet)
        binding.recyclerView.addItemDecoration(decoration)


    }
}