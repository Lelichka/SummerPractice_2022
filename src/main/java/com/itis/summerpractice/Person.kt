package com.itis.summerpractice

import android.widget.EditText

class Person (
    val name:String,val height:Double,val weight:Double,var age:Int
        ){
    fun Calculate (): Double{
        return ( weight/(height/100 * height/100) - age * 0.017 )
    }
}