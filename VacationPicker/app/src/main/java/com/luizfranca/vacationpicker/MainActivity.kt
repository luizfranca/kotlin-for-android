package com.luizfranca.vacationpicker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val placeList = arrayListOf("London", "Iceland", "Boston", "Seattle", "Vancouver")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener {
            val random = Random()
            val randomPlace = random.nextInt(placeList.count())

            selectedPlaceTxt.text = placeList[randomPlace]
        }

        addPlaceBtn.setOnClickListener {
            val newPlace = addPlaceTxt.text.toString()

            addPlaceTxt.text.clear()
            placeList.add(newPlace)
        }
    }
}
