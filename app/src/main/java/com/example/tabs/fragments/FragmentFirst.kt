package com.example.tabs.fragments
import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.tabs.R

class FragmentFirst: Fragment(R.layout.fragment_first) {
    private lateinit var textView: TextView
    private lateinit var editText: EditText
    private lateinit var buttonAdd: Button


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textView = view.findViewById(R.id.textView)
        editText = view.findViewById(R.id.editText)
        buttonAdd = view.findViewById(R.id.buttonAdd)
        val sharedPreferances = requireActivity()
            .getSharedPreferences("pref", Context.MODE_PRIVATE)



        buttonAdd.setOnClickListener {
            val note = editText.text.toString()
            val text = textView.text.toString()

            val result = note + '\n' + text
            textView.text = result

            sharedPreferances.edit().putString("note", result).apply()
        }


    }
}
