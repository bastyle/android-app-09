package ca.centennial.comp304.firstapplication.view

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Gravity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import ca.centennial.comp304.firstapplication.R
import ca.centennial.comp304.firstapplication.databinding.ActivityFirstBinding

//import ca.centennial.comp304.firstapplication.data

class FirstActivity : AppCompatActivity() {
//class FirstActivity : Activity() {

//    private lateinit var trueButton:Button
//    private lateinit var falseButton:Button
//    private lateinit var hellotext: TextView

    private lateinit var binding: ActivityFirstBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_first)
//        trueButton = findViewById(R.id.activity_first_true_button)
//        falseButton = findViewById(R.id.activity_first_false_button)
//        hellotext = findViewById(R.id.activity_first_hello_text_view)
//
//        hellotext.text="Is the class in the evenings?"
//
//        trueButton.setOnClickListener {
//            Toast.makeText(this, "You are wrong!", Toast.LENGTH_LONG).show()
//        }
//
//        falseButton.setOnClickListener {
//            Toast.makeText(this, "You are right!", Toast.LENGTH_LONG).show()
//        }
        binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.activityFirstHelloTextView.text = "Are you the best?"

        binding.activityFirstTrueButton.setOnClickListener {
            Toast.makeText(this, "Yes, you are!!", Toast.LENGTH_SHORT).show()
        }

        binding.activityFirstFalseButton.setOnClickListener {
            val myToast = Toast.makeText(this, "That is incorrect,\nBelieve me,\nYou are the Best!!", Toast.LENGTH_SHORT)
            myToast.setGravity(Gravity.CENTER,200,200)
            myToast.show()
        }
    }
}

class Nothing(lal:Int) : Something() {
    override fun getSomeValue()="Nothing is happening here..."
    companion object{
        //static access

    }

    init {
        //after constructor
        println("lal val from constructor $lal")
    }
}


open class Something {
    private val someValue = "lala"
    val array = ArrayList<Int>()
    open fun getSomeValue()=someValue
}