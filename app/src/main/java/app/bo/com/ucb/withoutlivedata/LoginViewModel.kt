package app.bo.com.ucb.withoutlivedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel(val loginRepository: LoginRepository): ViewModel() {
    val model : LiveData<UiModel>
        get() {
            return _model
        }
    private val _model = MutableLiveData<UiModel>()

    sealed class UiModel{
        object Loading: UiModel()
        class Login(val resp: String): UiModel()
    }

    fun doLogin(userName: String, password:String) {
        _model.value = UiModel.Login( loginRepository.login(userName, password))
    }

}