package com.example.kursovaya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kursovaya.R
import android.widget.ImageButton
import android.os.CountDownTimer
import android.content.Intent
import android.view.View
import android.widget.TextView
import com.example.kursovaya.Sost

class Sevz : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sevz)
        val back = findViewById<View>(R.id.dann3) as ImageButton
        back.setOnClickListener {
            back.setImageResource(R.drawable.knopkaser_nazh)
            object : CountDownTimer(300, 1000) {
                override fun onTick(millisUntilFinished: Long) {}
                override fun onFinish() {
                    back.setImageResource(R.drawable.knopkaser)
                    val i = Intent(this@Sevz, Menu::class.java)
                    startActivity(i)
                }
            }.start()
        }

        val vozd: TextView
        val voda: TextView
        val poch: TextView
        vozd = findViewById<View>(R.id.textView30) as TextView
        voda = findViewById<View>(R.id.textView32) as TextView
        poch = findViewById<View>(R.id.textView34) as TextView
        vozd.text = Sost.get(1, 0)
        voda.text = Sost.get(1, 1)
        poch.text = Sost.get(1, 2)
    }
}