package app.bo.com.ucb.withoutlivedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LiveDataString : ViewModel() {
    var counter: Int  = 0
    val cadena: LiveData<String>
        get() = _cadena
    val _cadena = MutableLiveData<String>()

    fun add() {
        _cadena.value = (counter++).toString()
    }

}