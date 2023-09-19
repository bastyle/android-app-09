package ca.centennial.comp304.firstapplication.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ca.centennial.comp304.firstapplication.databinding.ActivityDemo2Binding
import ca.centennial.comp304.firstapplication.databinding.ActivityDemoBinding

class Demo2Activity:AppCompatActivity() {

    lateinit var binding: ActivityDemo2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDemo2Binding.inflate(layoutInflater)
        val extras = intent.extras
        val text = if (extras !=null) extras.get("extra_data") as String else ""
        setContentView(binding.root)
        binding.textView.text = text
    }
}