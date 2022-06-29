package com.itis.summerpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {

    private var result: TextView? = null
    private var buttonGo: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        result = findViewById(R.id.textResult)
        buttonGo = findViewById(R.id.buttonGo)


        buttonGo?.setOnClickListener{
            val EditTextName : EditText = findViewById(R.id.editTextPersonName)
            val EditTextHeight : EditText = findViewById(R.id.editTextPersonHeight)
            val EditTextWeight : EditText = findViewById(R.id.editTextPersonWeight)
            val EditTextAge : EditText = findViewById(R.id.editTextPersonAge)
            val age:Int? = EditTextAge.text.toString().toIntOrNull()
            val height:Int? = EditTextHeight.text.toString().toIntOrNull()
            val weight:Double? = EditTextWeight.text.toString().toDoubleOrNull()
            if (Check(EditTextName.text.toString(),height,weight,age)){
                val person = Person(EditTextName.text.toString(),height!!.toDouble(),weight!!.toDouble(),age!!.toInt())
                result?.text = "${EditTextName.text.toString()}, your body mass index is ${String.format("%.3f",person.Calculate())}"
            }
            else result?.text ="Data entered incorrectly"
        }
    }
    fun Check(name:String?,height:Int?,weight:Double?,age:Int?) : Boolean{
        if (name == null || height == null || weight == null || age == null) return false
        if (name?.length < 1 || name?.length > 51) return false
        if (height < 1 || height > 251) return false
        if (weight < 1.0 || weight > 251.0) return false
        if (age < 1 || age > 151) return false
        return true
    }
}