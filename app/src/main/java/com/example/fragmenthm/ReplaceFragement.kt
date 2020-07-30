package com.example.fragmenthm

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

@Suppress("UNREACHABLE_CODE")
class ReplaceFragement : Fragment(){

    private var listener : FragmentL? =null
    private var btnReplace : Button? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as FragmentL
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.replace_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnReplace = view.findViewById(R.id.btnReplace)

        click()
    }

    private fun click() {
        btnReplace?.setOnClickListener {
            listener?.forAdd()
        }
    }

}