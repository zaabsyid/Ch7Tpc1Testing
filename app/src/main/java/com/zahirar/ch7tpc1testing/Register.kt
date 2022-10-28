package com.zahirar.ch7tpc1testing

class Register {
    private val existingUsers = listOf("Zahir", "Iqbal", "Richard", "Rois")

    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmedPassword: String
    ): Boolean {
        if (username.isEmpty() || password.isEmpty() || confirmedPassword.isEmpty()){
            return false
        }
        if (username in existingUsers){
            return false
        }
        if (password != confirmedPassword){
            return false
        }
        if (password.count { it.isDigit() } < 2){
            return false
        }
        if (confirmedPassword.count { it.isDigit() } < 2){
            return false
        }
        return true
    }
}