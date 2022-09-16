package app.bo.com.ucb.withoutlivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer

class LiveDataStringActivity : AppCompatActivity() {
    lateinit var btnAdd : Button
    lateinit var txtCounter: TextView
    val liveDataString : LiveDataString = LiveDataString()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data_string)

        btnAdd = findViewById(R.id.buttonAddLiveData)
        txtCounter = findViewById(R.id.textViewCounter)

        liveDataString.cadena.observe(this, Observer(::updateUI))

        btnAdd.setOnClickListener {
            liveDataString.add()
        }

    }

    private fun updateUI( s: String) {
        txtCounter.text = s
    }
}