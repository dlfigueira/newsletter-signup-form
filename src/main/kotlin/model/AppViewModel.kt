package model

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class AppViewModel {
    var userEmailAddress by mutableStateOf<String?>(null)
    var successfullySubscribed by mutableStateOf(false)

    fun isEmailValid(email: String? = userEmailAddress): Boolean {
        val emailRegex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+\\.[a-z]{2,}$".toRegex()
        return email?.matches(emailRegex) ?: true
    }

    fun onSubscribe(email: String) {
        userEmailAddress = email

        if(email.isNotEmpty() && isEmailValid(email)) successfullySubscribed = true
    }

    fun onDismiss() {
        successfullySubscribed = false
        userEmailAddress = null
    }
}