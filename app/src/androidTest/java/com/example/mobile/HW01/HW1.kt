package com.example.mobile.HW01

fun main(){
    val h = 175.00f
    val w = 160.00f
    println("""
        Height : $h
        Weight : $w
         BMI   : ${bmi(h,w)}
    """)
}
fun bmi(h:Float,w:Float):Float{
    val h1 = h/100.00f
    return w/(h1*h1)
}