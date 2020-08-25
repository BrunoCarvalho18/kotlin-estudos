import java.lang.Exception
import java.lang.NumberFormatException

fun main(){

    try {
        println("svdg".toInt())
    } catch (e: NumberFormatException){
        println("Essse valor não é numérico")
    } catch (e: Exception){
        println("Algo de errado ocorreu")
    } finally {
        println("adadakd")
        println("adafaf")
    }
}