package ca.centennial.comp304.firstapplication.view

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import ca.centennial.comp304.firstapplication.databinding.FragmentFirstBinding

class FirstFragment:Fragment() {
    //class FirstFragment:Fragment(R.layout.fragment_first) {

    companion object{
        private const val TAG = "FirstFragment"
    }

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ca.centennial.comp304.firstapplication.databinding.FragmentFirstBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        binding.fragmentButton.setOnClickListener {
            //Toast.makeText(requireActivity(),"Toast from fragment", Toast.LENGTH_LONG).show()
            (requireActivity()as FragmentsActivity).showToast()
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.e(TAG,"onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e(TAG,"onCreate")
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG,"onResume")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG,"onResume")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e(TAG,"onResume")
    }
    fun showToast(){
        Toast.makeText(requireActivity(),"This is triggered from activity", Toast.LENGTH_SHORT).show()
    }
}