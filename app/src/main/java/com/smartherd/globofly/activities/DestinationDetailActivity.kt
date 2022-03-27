package com.example.globofly.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import com.example.globofly.R
import com.example.globofly.helpers.SampleData
import com.example.globofly.models.Destination

class DestinationDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_destination_detail)

        val bundle: Bundle? = intent.extras

        if (bundle?.containsKey(ARG_ITEM_ID)!!) {

            val id = intent.getIntExtra(ARG_ITEM_ID, 0)

            loadDetails(id)

            initUpdateButton(id)

            initDeleteButton(id)
        }
    }


    private fun loadDetails(id: Int) {
        val et_city:TextView = findViewById(R.id.et_city)
        val et_description:TextView = findViewById(R.id.et_description)
        val et_country:TextView = findViewById(R.id.et_country)
        val sampleData = SampleData()
        val destination = sampleData.getDestinationById(id)

        destination?.let {
            et_city.setText(destination.city)
            et_description.setText(destination.description)
            et_country.setText(destination.country)

           // collapsing_toolbar.title = destination.city
        }
    }

    private fun initUpdateButton(id: Int) {
        val et_city:TextView = findViewById(R.id.et_city)
        val et_description:TextView = findViewById(R.id.et_description)
        val et_country:TextView = findViewById(R.id.et_country)
        val btn_update:Button = findViewById(R.id.btn_update)

        btn_update.setOnClickListener {

            val city = et_city.text.toString()
            val description = et_description.text.toString()
            val country = et_country.text.toString()

            // To be replaced by retrofit code
            val destination = Destination()
            destination.id = id
            destination.city = city
            destination.description = description
            destination.country = country

            val sampleData = SampleData()
            sampleData.updateDestination(destination);
            finish() // Move back to DestinationListActivity
        }
    }

    private fun initDeleteButton(id: Int) {

        val btn_delete:Button = findViewById(R.id.btn_delete)

        btn_delete.setOnClickListener {

            // To be replaced by retrofit code
            val sampleData = SampleData()
            sampleData.deleteDestination(id)
            finish() // Move back to DestinationListActivity
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == android.R.id.home) {
            navigateUpTo(Intent(this, DestinationListActivity::class.java))
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    companion object {

        const val ARG_ITEM_ID = "item_id"
    }
}