//Salary Calculator
package com.example.mobile.Homework1

fun main() {
    print("กรุณาใส่เวลาทำงานของคุณ : ")
    val time1 = readLine()!!.toIntOrNull()
    println("---------------------------")
    if (time1 == null) {
        println("กรุณาระบุเวลาทำการ!!!")
    }else
        Calsalary(time1)
}

fun Calsalary (time1:Int) {
    var salary : Int = if(time1 <= 40){
        time1*100
    }else
        ((time1-40)*150)+4000

    println("ผลลัพธ์ : $salary")
}