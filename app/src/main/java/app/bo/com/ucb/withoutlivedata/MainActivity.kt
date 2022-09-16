package app.bo.com.ucb.withoutlivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btnAdd: Button
    lateinit var txtCounter: TextView
    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAdd = findViewById(R.id.button_add)
        txtCounter = findViewById(R.id.textview_counter)
        txtCounter.text = counter.toString()

        btnAdd.setOnClickListener {
            counter++
            txtCounter.text = counter.toString()
        }
    }
}