package com.example.thracian.ui.category

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.thracian.R
import com.example.thracian.data.SubCategoryResponse
import com.example.thracian.utils.LocalJsonParser.Companion.getJsonDataFromAsset
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class CategoryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_category, container, false)

        val jsonFileString = this.context?.let { getJsonDataFromAsset(it, "subcategory.json") }
        Log.i("data", jsonFileString!!)

        val gson = Gson()
        val listPersonType = object : TypeToken<SubCategoryResponse>() {}.type
        var subCategoryResponse: SubCategoryResponse = gson.fromJson(jsonFileString, listPersonType)

        var title = subCategoryResponse.subcategories[4].title
//        var responseListener =  subCategoryResponse.subcategories.get()
        Log.i("gei", subCategoryResponse.subcategories[4].title)


        var severozapadnalist = arrayListOf("Област Видин","Област Враца","Област Ловеч", "Област Монтана","Област Плевен")
        var severoiztochnalist  = arrayListOf("Област Видин","Враца","Област Ловеч", "Област Монтана","Област Плевен")
        var ugozapadnalist = arrayListOf("Област Видин","Област Враца"," Ловеч", "Област Монтана","Област Плевен")
        var ugoiztochnalist = arrayListOf("Област Видин","Област Враца", "Област Монтана","Област Плевен")
        // Inflate the layout for this fragment
        val categoryOne = view.findViewById<CardView>(R.id.severozapadna_bulgaria)
        val severozapadnaBulgaria = categoryOne.findViewById<TextView>(R.id.category_textView)
        severozapadnaBulgaria.text = getString(R.string.severozapdna_bulgaria)
        categoryOne.setOnClickListener{
            var bundle = bundleOf("list" to severozapadnalist)

            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment,bundle)
        }
        val categoryTwo = view.findViewById<CardView>(R.id.severoiztochna_bulgaria)
        val severoiztochnaBulgaria = categoryTwo.findViewById<TextView>(R.id.category_textView)
        severoiztochnaBulgaria.text = getString(R.string.severoiztochna_bulgaria)
        categoryTwo.setOnClickListener{
            var bundle = bundleOf("list" to severoiztochnalist)
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment,bundle)
        }
        val categoryThree = view.findViewById<CardView>(R.id.ugoiztochna_bulgaria)
        val ugoiztochnaBulgaria = categoryThree.findViewById<TextView>(R.id.category_textView)
        ugoiztochnaBulgaria.text = getString(R.string.ugoiztochna_bulgaria)
        categoryThree.setOnClickListener{
            var bundle = bundleOf("list" to ugoiztochnalist)
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment,bundle)
        }
        val categoryFour = view.findViewById<CardView>(R.id.ugozapadna_bulgaria)
        val ugozapadnaBulgaria = categoryFour.findViewById<TextView>(R.id.category_textView)
        ugozapadnaBulgaria.text = getString(R.string.ugozapadna_bulgaria)
        categoryFour.setOnClickListener{
            var bundle = bundleOf("list" to ugozapadnalist)
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment,bundle)
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }
}