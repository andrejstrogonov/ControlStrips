package com.home.controlstrips.modes

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.home.controlstrips.R

class ModesFragment : Fragment() {

    companion object {
        fun newInstance() = ModesFragment()
    }

    private lateinit var viewModel: ModesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_modes, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ModesViewModel::class.java)
        // TODO: Use the ViewModel
    }

}