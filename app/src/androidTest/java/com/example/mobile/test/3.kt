package com.example.mobile.test

fun main() {
    print("Enter = ")
    var l = readLine()!!.toLong()
    var n: Double = 2.0
    var s: Double = 0.0
    while (n <= l) {
        s += (n * n)
        n *= 2
    }
    println(s)
    print("\n-------------")
}