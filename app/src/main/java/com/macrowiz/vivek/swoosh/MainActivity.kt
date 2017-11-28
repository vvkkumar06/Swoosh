package com.macrowiz.vivek.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            getStartedBtn.setOnClickListener{
                   val  LeagueIntent =  Intent(this, LeagueActivity::class.java)
                    startActivity(LeagueIntent)
            }
    }
}
