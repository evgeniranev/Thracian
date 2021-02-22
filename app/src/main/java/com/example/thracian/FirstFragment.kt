package com.example.thracian

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        // Inflate the layout for this fragment
        val categoryOne = view.findViewById<CardView>(R.id.severozapadna_bulgaria)
        val severozapadnaBulgaria = categoryOne.findViewById<TextView>(R.id.category_textView)
        severozapadnaBulgaria.text = getString(R.string.severozapdna_bulgaria)
        categoryOne.setOnClickListener{
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
        val categoryTwo = view.findViewById<CardView>(R.id.severoiztochna_bulgaria)
        val severoiztochnaBulgaria = categoryTwo.findViewById<TextView>(R.id.category_textView)
        severoiztochnaBulgaria.text = getString(R.string.severoiztochna_bulgaria)
        categoryTwo.setOnClickListener{
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
        val categoryThree = view.findViewById<CardView>(R.id.ugoiztochna_bulgaria)
        val ugoiztochnaBulgaria = categoryThree.findViewById<TextView>(R.id.category_textView)
        ugoiztochnaBulgaria.text = getString(R.string.ugoiztochna_bulgaria)
        categoryThree.setOnClickListener{
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
        val categoryFour = view.findViewById<CardView>(R.id.ugozapadna_bulgaria)
        val ugozapadnaBulgaria = categoryFour.findViewById<TextView>(R.id.category_textView)
        ugozapadnaBulgaria.text = getString(R.string.ugozapadna_bulgaria)
        categoryFour.setOnClickListener{
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }
}