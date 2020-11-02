package com.example.tugasmodul5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tugasmodul5.R
import com.example.tugasmodul5.Users
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Users>()
    val listUsers = arrayOf(
            "Radjamin Nasution",
            "Indrakoesoema",
            "Soerjadi",
            "Doel Arnowo",
            "Moestadjab Soemowidagdo",
            "Istadjab Tjokrokoesoemo",
            "Raden Satrio Sastrodiredjo",
            "Moerachman",
            "Raden Soekotjo",
            "Raden Soeparno",
            "Moehadji Widjaja",
            "Poernomo Kasidi",
            "Soenarto Soemoprawiro",
            "Bambang Dwi Hartono",
            "Tri Rismaharini"
    )
    val selamat = arrayOf(
            "Selamat Datang di Kota Surabaya"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerview = findViewById<RecyclerView>(R.id.mRecycleView)
        mRecycleView.setHasFixedSize(true)
        mRecycleView.layoutManager = LinearLayoutManager(this)
        for (i in 0 until listUsers.size) {
            list.add(Users(listUsers.get(i)))
            if (listUsers.size - 1 == i) {
                val adapter = Adapter(list)
                adapter.notifyDataSetChanged()
                mRecycleView.adapter = adapter
                adapter.setOnClickListener {
                    Toast.makeText(this, "Selamat Datang di Kota Pahlawan " , Toast.LENGTH_SHORT).show()
                }
            }
        }
        mRecycleView.scrollToPosition(selamat.size -
                1);

    }
}
