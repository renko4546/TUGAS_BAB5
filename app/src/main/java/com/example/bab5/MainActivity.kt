package com.example.bab5
import Getsetarray
import ListOutput
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var listdat: RecyclerView
    private var list: ArrayList<Getsetarray> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listdat = findViewById(R.id.bab5)
        listdat.setHasFixedSize(true)
        list.addAll(dataArray.listData)//
        showRecyclerList()
    }

    private fun showRecyclerList() {
        listdat.layoutManager = LinearLayoutManager(this)
        val listOut = ListOutput(list)
        listdat.adapter = listOut

        listOut.setOnItemClickCallback(object : ListOutput.OnItemClickCallback {
            override fun onItemClicked(data: Getsetarray) {
                showData(data)
            }
        })
    }

    private fun showData(det : Getsetarray) {
        Toast.makeText(this, "Kamu memilih " + det.detail, Toast.LENGTH_SHORT).show()
    }
}

