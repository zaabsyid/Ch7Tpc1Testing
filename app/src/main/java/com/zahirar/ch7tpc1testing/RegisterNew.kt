package com.zahirar.ch7tpc1testing

class RegisterNew {

    private val existingUsers = listOf("Zahir", "Iqbal", "Richard", "Rois")
    private val existingEmail = listOf("zahir@gmail.com", "iqbal@gmail.com", "richard@gmail.com", "rois@gmail.com")

    fun validate(username : String, email : String, password: String, confirmPassword : String):String?{
        if (username.isEmpty()){
            return "Username is Empty"
        }
        if (username.length<6){
            return "Username too short"
        }
        if (username.length>20){
            return "Username too long"
        }
        if (username in existingUsers){
            return "Username already exist"
        }

        if (email.isEmpty()){
            return  "Email is Empty"
        }
        if (email in existingEmail){
            return "Email already exist"
        }

        if (password.isEmpty()){
            return "Password is Empty"
        }
        if (password.length<6){
            return "Password too short"
        }

        if (confirmPassword.length<6){
            return "Confirm Password is not valid"
        }


        return null
    }

}