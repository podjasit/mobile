package com.example.mobile.test

fun main() {
    print("input = ")
    var y = readLine()!!.toLong()
    var x: Double = 0.0
    if (y <= 50) {
        x = (y * 4.25)
    } else if (y <= 100) {
        x = (y * 3.25)
    } else {
        x = (y * 2.25)
    }
    print("Output = $x")
}