package com.example.calcapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener(this)
        btn2.setOnClickListener(this)
        btn3.setOnClickListener(this)
        btn4.setOnClickListener(this)

    }

    override fun onClick(v: View) {


        if (et1.text.isEmpty() || et2.text.isEmpty()) {
            Snackbar.make(v , "何か数値を入れてください", Snackbar.LENGTH_INDEFINITE)
                .show()


        } else {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(
                "VALUE1",
                et1.text.toString().toDouble() + et2.text.toString().toDouble()
            )
            startActivity(intent)

        }


        if (et1.text.isEmpty() || et2.text.isEmpty()) {
            Snackbar.make(v, "何か数値を入れてください", Snackbar.LENGTH_INDEFINITE)
                .show()
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(
                "VALUE1",
                et1.text.toString().toDouble() - et2.text.toString().toDouble()
            )
            startActivity(intent)
        } else {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(
                "VALUE1",
                et1.text.toString().toDouble() - et2.text.toString().toDouble()
            )
            startActivity(intent)

        }

        if (et1.text.isEmpty() || et2.text.isEmpty()) {
            Snackbar.make(v, "何か数値を入れてください", Snackbar.LENGTH_INDEFINITE)
                .show()


        } else {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(
                "VALUE1",
                et1.text.toString().toDouble() * et2.text.toString().toDouble()
            )
            startActivity(intent)

        }

        if (et1.text.isEmpty() || et2.text.isEmpty()) {
            Snackbar.make(v, "何か数値を入れてください", Snackbar.LENGTH_INDEFINITE)
                .show()
        } else {

            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(
                "VALUE1",
                et1.text.toString().toDouble() / et2.text.toString().toDouble()
            )
            startActivity(intent)

        }
    }
}





