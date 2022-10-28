package com.zahirar.ch7tpc1testing

import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class RegisterTest {

    lateinit var regist : Register

    @Before
    fun setup(){
        regist = Register()
    }

    @Test
    fun passworEmpty_False(){
        val result = regist.validateRegistrationInput("Faldi", "", "1234")
        assertEquals("password empty", result, false)
    }

    @Test
    fun usernameEmpty(){
        val user = "qwerty"
        val result = regist.validateRegistrationInput(user,"1234","1234")
        assertEquals("oke",result,true)
    }

    @Test
    fun existingUsername(){
        val user= "Zahir"
        val result = regist.validateRegistrationInput(user,"1234","1234")
        assertEquals("username exist", result,false)
    }
}