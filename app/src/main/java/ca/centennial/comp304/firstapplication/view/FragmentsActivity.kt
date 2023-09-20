package ca.centennial.comp304.firstapplication.view

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import ca.centennial.comp304.firstapplication.R
import ca.centennial.comp304.firstapplication.databinding.ActivityFragmentsBinding

class FragmentsActivity:AppCompatActivity() {

    private lateinit var binding: ActivityFragmentsBinding
    private lateinit var firstFragment: FirstFragment

    companion object{
        const val TAG ="FragmentActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e(TAG,"onCreate")
        super.onCreate(savedInstanceState)
        binding = ca.centennial.comp304.firstapplication.databinding.ActivityFragmentsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firstFragment= FirstFragment()
        val secondFragment= SecondFragment()
        val fragmentTransaction = supportFragmentManager.beginTransaction()


        fragmentTransaction.add(R.id.fragment_container_1, firstFragment, "FirstFragment")
        fragmentTransaction.add(R.id.fragment_container_2, secondFragment, "SecondFragment")
        fragmentTransaction.commit()
        Toast.makeText(this,"Toast from Activity",Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG,"onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG,"onResume")
        firstFragment.showToast()
    }

    override fun onRestart() {
        super.onRestart()
        Log.e(TAG,"onRestart")
    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG,"onStop")
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG,"onPause")
    }

    fun showToast(){
        Toast.makeText(this,"Activity msg", Toast.LENGTH_SHORT).show()
    }


}