package com.example.midcustomlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class Adapter (var mycntx:Context,var resources:Int,var items:List<Model>):ArrayAdapter<Model>(mycntx,resources,items){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater=LayoutInflater. from(mycntx)
        val view:View=layoutInflater.inflate(resources, null)
        val imageView:ImageView=view.findViewById(R.id.image)
        val Tv_title:TextView=view.findViewById(R.id.Tv_maintext)
        val Tv_description:TextView=view.findViewById(R.id.Tv_subtext)

        var myitem:Model=items[position]
        imageView.setImageDrawable(mycntx.resources.getDrawable(myitem.img))
        Tv_title.text=myitem.title
        Tv_description.text=myitem.description

    }
}