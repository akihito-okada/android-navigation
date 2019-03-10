package com.example.android.codelabs.navigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

/**
 * A simple [Fragment] subclass.
 *
 */
class BlankFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val safeArgs = BlankFragmentArgs.fromBundle(arguments)
        val hogeParam = safeArgs.hogeParam

        Toast.makeText(context, "hogeParam : $hogeParam", Toast.LENGTH_SHORT).show()

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }
}
