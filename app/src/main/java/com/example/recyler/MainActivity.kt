package com.example.recyler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyler.adapter.ActorAdapter
import com.example.recyler.model.Actor

class MainActivity : AppCompatActivity() {
    private var lstactors= ArrayList<Actor>()
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView= findViewById(R.id.recylerview)
        loadactors()
        val  adapter =ActorAdapter(lstactors,this@MainActivity)
        recyclerView.layoutManager=LinearLayoutManager(this@MainActivity)
        recyclerView.adapter= adapter
    }

    private fun loadactors() {
       lstactors.add(Actor(0,"Nitesh Paudel","https://i.pinimg.com/originals/37/7f/b6/377fb6a4b24ccd66abb74784f74959e8.jpg",1990,"Nepal"))
        lstactors.add(Actor(1,"Rashesh Dai","https://myrepublica.nagariknetwork.com/uploads/media/RajeshHamal.jpg",8000,"Nepal"))
        lstactors.add(Actor(2,"Tom Hardy","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiQOLZNsEO8BMsidEfvQWLC_o0aRUciAuCvw&usqp=CAU",19000,"Usa"))
        lstactors.add(Actor(3,"Sydney ","data:image/jpeg;base64,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",11990,"Nepal"))
    }
}