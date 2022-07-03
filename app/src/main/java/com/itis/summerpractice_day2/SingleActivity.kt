package com.itis.summerpractice_day2

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.itis.summerpractice_day2.databinding.ActivitySingleBinding
import java.util.*

class SingleActivity : AppCompatActivity(){

    private lateinit var controller:NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single)

        controller = (supportFragmentManager.findFragmentById(R.id.container) as NavHostFragment).navController

        val bottomView = findViewById<BottomNavigationView>(R.id.bottom_view)
        bottomView.setupWithNavController(controller)
    }
}