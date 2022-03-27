package com.example.globofly.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.globofly.R
import com.example.globofly.helpers.SampleData
import com.example.globofly.models.Destination

class  DestinationCreateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_destination_create)

        val myName:String = "Nachiketa "
       val context = this
        // Show the Up button in the action bar.
      //  supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val btn_add:Button = findViewById(R.id.btn_add)
        val et_city:TextView = findViewById(R.id.et_city)
        val et_description:TextView = findViewById(R.id.et_description)
        val et_country:TextView = findViewById(R.id.et_country)

        btn_add.setOnClickListener {
            val newDestination = Destination()
            newDestination.city = et_city.text.toString()
            newDestination.description = et_description.text.toString()
            newDestination.country = et_country.text.toString()

            // To be replaced by retrofit code
            val sampleData = SampleData()
            sampleData.addDestination(newDestination)
            finish() // Move back to DestinationListActivity
        }
    }
}