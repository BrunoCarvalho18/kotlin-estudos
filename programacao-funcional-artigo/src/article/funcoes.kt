package article

fun firstdegree(a: Double, x: Double, b: Double): Double = (a * x) + b

fun square(side: Int): Int = side * side

fun sum(x: Int, y: Int): Int = x + y

fun getDiscountCode(): String = "50OFF"

val squareFunctionType = ::square

val addition: (Int, Int) -> Int = { x, y -> x + y }

val subtraction: (Int, Int) -> Int = { x, y -> x - y }

fun executeOperation(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return (operation(x, y))
}


fun main() {
    println(firstdegree(25.0, 1.30, 4.50))
    println("The square is: " + square(4))
    println("The sum is: " + sum(4, 4))
    println(getDiscountCode())
    println(squareFunctionType(2))
    println(executeOperation(1, 2, addition))
    println(executeOperation(5, 4, subtraction))
}