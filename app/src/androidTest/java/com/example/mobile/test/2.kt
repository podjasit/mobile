package com.example.mobile.test

fun main() {
    print("Enter : ")
    var y = readLine()!!.toLong()
    for (z in 1..y){
        if ((36%z).toInt() == 0){
            println(" $z ")
        }
    }
}