package com.example.midcustomlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var listview=findViewById<ListView>(R.id.listview)
        var list= mutableListOf<Model>()

//        adding images
        list.add(Model("yeat","This is yeat",R.drawable.index))
        list.add(Model("play boy","This is carti",R.drawable.carti))
        list.add(Model("savage","This is 21 savage",R.drawable.savage))
        list.add(Model("Lionel","This is Messi",R.drawable.messi))
        list.add(Model("Ashraf","This is Hakimi",R.drawable.hakimi))
        list.add(Model("d4vd","This is d4vd",R.drawable.davd))
    }
}