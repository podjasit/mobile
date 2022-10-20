import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main(){
    val n = LocalDateTime.now()
    val d = n.format(DateTimeFormatter.ofPattern("dd.MM.yyyy. HH:mm:ss"))
    println("วันที่เวลาปัจจุบันนี้คือ : $d ")
}