package basic

fun operatorl(x:Int,y:Int,op:(Int,Int) ->Int):Int{
    val ret= op(x,y)
    return ret
}

fun suml(x: Int,y: Int) = x + y

fun multiplyl (x:Int,y:Int):Int = x * y

fun main(){
    operator(1,2,::suml)
    operator(1,2,::multiplyl)

    val l1 ={a:Int,b:Int->a + b}
    val l2: (Int,Int) ->  Int = { numerador, i -> numerador + i}
    operator(10,20,l1)
    operator(10,20,l2)
}