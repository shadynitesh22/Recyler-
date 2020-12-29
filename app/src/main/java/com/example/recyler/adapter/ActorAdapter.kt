package com.example.recyler.adapter

import android.content.Context
import android.view.ContextThemeWrapper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyler.R
import com.example.recyler.model.Actor
import de.hdodenhof.circleimageview.CircleImageView
import java.security.AccessControlContext

class ActorAdapter(
    val lstactors:ArrayList<Actor>,
val context: Context
)


    :RecyclerView.Adapter<ActorAdapter.ActorViewHolder>(){

    class ActorViewHolder(view: View):RecyclerView.ViewHolder(view) {

        val imgprofile: CircleImageView
        val tvname: TextView
        val tvadress: TextView
        val tvSalary: TextView


        init {
            imgprofile = view.findViewById(R.id.imgProfile)
            tvname=view.findViewById(R.id.tvName)
            tvadress=view.findViewById(R.id.tvAddress)
            tvSalary=view.findViewById(R.id.tvSalary)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActorViewHolder {
       val view = LayoutInflater.from(parent.context)
           .inflate(R.layout.meroactorlayout,parent,false)
        return ActorViewHolder(view)
    }

    override fun getItemCount(): Int {
        return lstactors.size
    }

    override fun onBindViewHolder(holder: ActorViewHolder, position: Int) {
       val actor= lstactors[position]
        holder.tvname.text=actor.ActorName

        holder.tvSalary.text= actor.Salary.toString()
        Glide.with(context)
            .load(actor.Imageurl)
            .into(holder.imgprofile)



    }
}