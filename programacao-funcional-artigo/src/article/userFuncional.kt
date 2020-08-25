package article

data class UserFunction(var id:Int, var name: String, var state: String)

val userOne =  UserFunction(1,"João","RJ")
val userTwo =  UserFunction(2,"Maria","MG")
val userThree =  UserFunction(3,"José","SP")
val userFour = UserFunction(4,"Marta","RJ")

val users= listOf(userOne, userTwo, userThree, userFour)

val usersFromRJ = users.filter { it.state=="RJ" }

val usersFromSP = users.filter { it.state=="SP" }

val usersGroupedByState = users.groupBy { it.state }

fun main() {
    println(usersFromRJ)
    println("------------------------------")
    println(usersFromSP)
}