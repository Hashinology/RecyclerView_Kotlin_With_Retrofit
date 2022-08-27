package com.hashinology.recyclerviewkotlinwithdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.hashinology.recyclerviewkotlinwithdata.adapter.DataAdapter
import com.hashinology.recyclerviewkotlinwithdata.model.MyData
import com.hashinology.recyclerviewkotlinwithdata.ui.MyInterface
import com.hashinology.recyclerviewkotlinwithretrofit.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , MyInterface{

    lateinit var dataAdapter: DataAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myDataList = ArrayList<MyData>()

        myDataList.add(0, MyData("Cat", "White"))
        myDataList.add(1, MyData("Cat", "White"))
        myDataList.add(2, MyData("Cat", "White"))
        myDataList.add(3, MyData("Cat", "White"))
        myDataList.add(4, MyData("Cat", "White"))
        myDataList.add(5, MyData("Cat", "White"))
        myDataList.add(6, MyData("Cat", "White"))
        myDataList.add(7, MyData("Cat", "White"))
        myDataList.add(8, MyData("Cat", "White"))
        myDataList.add(9, MyData("Cat", "White"))
        myDataList.add(10, MyData("Cat", "White"))
        myDataList.add(11, MyData("Cat", "White"))

        dataAdapter = DataAdapter(myDataList, this, this)
        rvAnimal.apply {
            adapter = dataAdapter
            layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)
        }
    }

    override fun getInterfaceClcick(view: View, position: Int) {
      Toast.makeText(this@MainActivity, "Current Position is: $position", Toast.LENGTH_SHORT).show()
    }
}