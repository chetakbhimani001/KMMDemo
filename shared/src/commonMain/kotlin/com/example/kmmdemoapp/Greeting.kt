package com.example.kmmdemoapp

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}