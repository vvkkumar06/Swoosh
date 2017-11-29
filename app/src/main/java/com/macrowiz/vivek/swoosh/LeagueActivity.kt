package com.macrowiz.vivek.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league);


    }

    fun leagueNextClicked(view: View){
        if(selectedLeague != ""){


            val skillActivity = Intent(this, SkillActivity::class.java)

            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)

        }else{

            Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()

        }

    }



    fun mensOnclick (view: View){

        leagueWomensBtn.isChecked = false
        LeagueCoedBtn.isChecked = false
        selectedLeague="Mens"
    }

    fun womensOnclick(view: View){
        leagueMensBtn.isChecked =false
        LeagueCoedBtn. isChecked = false
        selectedLeague="womens"
    }
    fun coedonclick(view: View){
        leagueMensBtn.isChecked =false
        leagueWomensBtn.isChecked = false
        selectedLeague="co-ed"
    }
}
