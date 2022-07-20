package com.example.mobile.HW01

fun main(){
    val p = 80
    println("""
ได้คะแนน : $p
    """)
                point(p)
}
fun point(p1:Int){
    return(
            when(p1) {
                in 50..59->{
                    println("*** เกรด 1 ***")
                }
                in 60..69-> {
                    println("*** เกรด 2 ***")
                }
                in 70..79->{
                    println("*** เกรด 3 ***")
                }
                else-> {
                    println("*** เกรด 4 ***")
                }
            }


            )
}