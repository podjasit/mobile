package com.example.mobile.HW01

fun main(){
    val m = 146894
    Function(m)
}
fun Function(m:Int){
    var m1000 = 0
    var m500 = 0
    var m100 = 0
    var m50 = 0
    var m20 = 0
    var m1 = m

    if (m1>= 1000){
        m1000 = m1/1000
        m1%=1000
    }
    if (m1>= 500){
        m500 = m1/500
        m1%=500
    }
    if (m1 >= 100){
        if (m1000 or m500 == 0){
            m50 = m1/50
            m1 %=50
        }else {
            m100 = m1 / 100
            m1 %= 100
        }
    }
    if (m1>= 50){
        if (m1 % 20 == 0){
        }else {
            m50 = m1 / 50
            m1 %= 50
        }
    }
    if (m1>= 20){
        m20 = m1/20
        m1%=20
    }
    println("""
        เงิน   : $m
        1000 = $m1000
        500  = $m500
        100  = $m100
        50   = $m50
        20   = $m20
    """)
}