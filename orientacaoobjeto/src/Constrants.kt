import kotlin.coroutines.Continuation
import kotlin.reflect.jvm.internal.impl.load.java.Constant

class Constrants private constructor(){
    companion object BANCO{
        val TABLE= "Pessoa"

        fun teste(){
            println("Sou um método estático")
        }
    }

    object VENDAS{
        val TABLE_NAME= "Vendas"

        object COLUNAS{
            val ID= "Id"
            val TOTAL= "Total"
        }
    }
}

fun main(){
    println(Constrants.TABLE)
    Constrants.teste()

    Constrants.BANCO.TABLE
    Constrants.BANCO.teste()

    Constrants.VENDAS.COLUNAS.TOTAL
}