package basic

fun operatorAnonymous(x:Int,y:Int,op:(Int,Int)->Int):Int{
    val ret = op(x,y)
    return ret
}



fun main(args: Array<String>) {
    operatorAnonymous(1,2,fun (n1:Int,n2:Int):Int{
        val sum = n1 + n2
        println(sum)
        return n1 + n2
    })

}