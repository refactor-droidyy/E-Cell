package com.rohit.iiitl.e_cell

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash.*

class Splash : AppCompatActivity() {

    private lateinit var anim : Animation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        anim = AnimationUtils.loadAnimation(this,R.anim.splash_anim)
        logo_bird.animation = anim
        val handler = Handler()
        handler.postDelayed({
            val intent = Intent(this@Splash, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 1400)
    }
}
