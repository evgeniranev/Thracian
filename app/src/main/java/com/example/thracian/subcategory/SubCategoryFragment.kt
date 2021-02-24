package com.example.thracian.subcategory

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.thracian.R

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SubCategoryFragment : Fragment(R.layout.fragment_subcategory) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_subcategory, container, false)
        val subCategoryAdapter = SubCategoryAdapter()
        val subcategoryRecyclerView: RecyclerView = view.findViewById(R.id.list_subcategory)
        subcategoryRecyclerView.adapter = subCategoryAdapter
//        subcategoryRecyclerView.layoutManager = GridLayoutManager(view.context, 2)
        subcategoryRecyclerView.layoutManager = LinearLayoutManager(view.context)
        var list = arrayListOf("Област Видин","Област Враца","Област Ловеч", "Област Монтана","Област Плевен")
        subCategoryAdapter.setData(list)
        return view
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}

