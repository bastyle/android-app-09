package ca.centennial.comp304.firstapplication.view

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import ca.centennial.comp304.firstapplication.R
import ca.centennial.comp304.firstapplication.databinding.ActivityDemoBinding
import java.net.URI

class DemoActivity:AppCompatActivity() {

    lateinit var binding:ActivityDemoBinding

    companion object{
        private const val TAG = "DEMO"
    }

    /**
     * setup ui. this method is called just once.
     */
    override fun onCreate(savedInstanceState: Bundle?) {//
        super.onCreate(savedInstanceState)
        binding = ActivityDemoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.e(TAG,"create")
    }


    override fun onStart() {
        super.onStart()
        Log.e(TAG,"start")

        binding.button1.setOnClickListener {
            val data = "tel:4379734995"
            val action = Intent.ACTION_CALL
            val intent = Intent(action, Uri.parse(data))
            startActivity(intent)

        }

        binding.button2.setOnClickListener {
            val data = "http://www.centennialcollege.ca"
            val action = Intent.ACTION_VIEW
            val intent = Intent(action, Uri.parse(data))
            startActivity(intent)
        }

        binding.button3.setOnClickListener {
            val intent = Intent(this, Demo2Activity::class.java)
            intent.putExtra("extra_data","COMP-304-F2023")
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG,"resume")
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG,"pause")
    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG,"stop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e(TAG,"restart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG,"destroy")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.e(TAG,"save instance")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.e(TAG,"restore instance")
    }

}