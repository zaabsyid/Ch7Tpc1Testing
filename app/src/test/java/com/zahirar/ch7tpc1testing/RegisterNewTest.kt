package com.zahirar.ch7tpc1testing

import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class RegisterNewTest{
    lateinit var regist : RegisterNew

    @Before
    fun setUp(){
        regist = RegisterNew()
    }
    @After
    fun tearDown(){

    }

    @Test
    fun username_is_empty() {
        val username = ""
        val assert = regist.validate(username, "test@gmail.com", "dkjafjla123","dkjafjla123")
        assert(assert == "Username is Empty")
    }
    @Test
    fun usernameExist(){
        val username = "Zahir"
        val assert = regist.validate(username,"test@gmail.com","1234","1234")
        assert(assert == "Username already exist")
    }
}