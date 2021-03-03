package com.lqgioan.publishing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lqgioan.library.Publishing

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Publishing().publish()
    }
}