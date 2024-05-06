package model

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class AppViewModel {
    var userEmailAddress by mutableStateOf("")
        private set

    fun onEmailChange(newEmail: String) {
        userEmailAddress = newEmail
    }

    fun isEmailValid(): Boolean {
        val emailRegex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+\\.[a-z]{2,}$".toRegex()
        return userEmailAddress.isEmpty() || userEmailAddress.matches(emailRegex)
    }
}