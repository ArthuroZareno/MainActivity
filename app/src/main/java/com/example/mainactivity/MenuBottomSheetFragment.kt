package com.example.mainactivity

import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mainactivity.adapter.MenuAdapter
import com.example.mainactivity.databinding.FragmentMenuBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class MenuBottomSheetFragment :BottomSheetDialogFragment() {
    private lateinit var binding:FragmentMenuBottomSheetBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuBottomSheetBinding.inflate(inflater,container,false)

        val menuFoodName = listOf(
            "New Balance XRCTU MSXRCTUD",
            "Custom Jordan 1",
            "Nike SB dunk low cut",
            "Adidas Ultrabounce",
            "Under Armour Shirt",
            "Under Armour Pants"
        )
        val menuItemPrice = listOf("₱299", "₱299", "₱299", "₱299", "₱299","₱299")
        val menuImage =
            listOf(
                R.drawable.men1,
                R.drawable.men2,
                R.drawable.men3,
                R.drawable.men4,
                R.drawable.men5,
                R.drawable.men6
            )
        val adapter = MenuAdapter(ArrayList(menuFoodName),ArrayList(menuItemPrice),ArrayList(menuImage))
        binding.menuRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.menuRecyclerView.adapter = adapter
        return binding.root
    }

    companion object {

    }
}