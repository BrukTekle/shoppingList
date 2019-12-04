package com.example.shoppinglist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_beauty.*

class beauty : AppCompatActivity() {
    var list= arrayListOf<String>("Lipstick","Makeup","Brash","Oil")
    var listCloths= arrayListOf<String>("Trousers","Shirt","Shoes","Pants","Hats","Belts")
    var listElectronic= arrayListOf<String>("Tv","Laptops","Frig","Charger")
    var listFood= arrayListOf<String>("Breakfast","Lunch","Dinner","Snacks")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beauty)
        var recivedIntent=intent

        var adapter:ArrayAdapter<String>?=null
        var type:String?=recivedIntent.getStringExtra("type")
        if(type=="electronics")
                    adapter= ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,listElectronic)
        else if(type=="cloth")
                     adapter= ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,listCloths)
        else if(type=="beauty")
                    adapter= ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,list)
        else if(type=="food")
                 adapter= ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,listFood)

        beautyList?.adapter=adapter
        beautyList.onItemClickListener= AdapterView.OnItemClickListener{ parent, view, position, id->
            val item=parent.getItemAtPosition(position).toString()
            Toast.makeText(this,"You have selected "+item+" item",Toast.LENGTH_LONG).show()
        }
    }
}
