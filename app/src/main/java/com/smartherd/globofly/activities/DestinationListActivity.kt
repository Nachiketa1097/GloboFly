//package com.example.globofly.activities
//
//import android.content.Intent
//import android.os.Bundle
//import android.widget.Toast
//import com.example.globofly.R
//import com.example.globofly.helpers.DestinationAdapter
//import com.example.globofly.helpers.SampleData
//import com.example.globofly.models.Destination
//import com.smartherd.globofly.services.DestinationService
//import com.smartherd.globofly.services.ServiceBuilder
//import retrofit2.Call
//import retrofit2.Callback
//import retrofit2.Response
//
//class DestinationListActivity : AppCompatActivity() {
//    val sampleData = SampleData()
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_destination_list)
//
//        val fab:FloatingActionButton = findViewById(R.id.fab)
//
//        loadDestinations()
//
//        fab.setOnClickListener {
//            val intent = Intent(this@DestinationListActivity, DestinationCreateActivity::class.java)
//            startActivity(intent)
//        }
//    }
//
//    override fun onResume() {
//        super.onResume()
//
//    }
//
//    private fun loadDestinations() {
////        val destiny_recycler_view :RecyclerView = findViewById(R.id.destiny_recycler_view)
//
////        destiny_recycler_view.layoutManager = LinearLayoutManager(this)
//
////        val data = ArrayList<Destination>()
////        val adapter = DestinationAdapter(data)
////        destiny_recycler_view.adapter = adapter
//
//      val destinationService = ServiceBuilder.buildService(DestinationService::class.java)
//
//      val requestCall = destinationService.getDestinationList()
//      requestCall.enqueue(object: Callback<List<Destination>> {
//
//          override fun onResponse(call: Call<List<Destination>>, response: Response<List<Destination>>) { // Call is an interface which contain all the httpt request and response
//              if (response.isSuccessful){
//                  val destinationList = response.body()!!
//                  destiny_recycler_view.adapter = DestinationAdapter(destinationList)
//
//              }
//          }
//
//          override fun onFailure(call: Call<List<Destination>>, t: Throwable) {
//              Toast.makeText(applicationContext, "No Data found ", Toast.LENGTH_LONG).show()
//          }
//
//      })
//
//    }
//}