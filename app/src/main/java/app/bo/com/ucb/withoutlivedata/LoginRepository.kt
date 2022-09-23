package app.bo.com.ucb.withoutlivedata

class LoginRepository() {
    fun login(userName: String, password: String): String {
        if( userName.equals("calyr")) {
            return "ok"
        }
        return "nok"
    }
}