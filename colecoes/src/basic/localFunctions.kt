package basic

import java.text.SimpleDateFormat
import java.util.*

fun log(str:String){
    val calendar = Calendar.getInstance()
    val formatted = SimpleDateFormat("HH:mm:ss")
    println("$str - ${formatted.format(calendar.time)}")
}

fun top(){
    fun log(str:String){
        val calendar = Calendar.getInstance()
        val formatted = SimpleDateFormat("HH:mm:ss")
        println("$str - ${formatted.format(calendar.time)}")
    }
    log("Inicio")

    val interval = 1..100000000
    var sum: Double=0.0
    for (i in interval){
        sum += i*2*1
    }

    log("Fim")
}

fun main(args: Array<String>){
   top()
    log("")
}