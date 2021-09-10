package com.proway.fake_api.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.proway.fake_api.R

class ProductDetailFragment : Fragment(R.layout.fragment_product_detail_fragment) {

    companion object {
        fun newInstance() = ProductDetailFragment()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ) {
//        // Inflate the layout for this fragment
//    }
}