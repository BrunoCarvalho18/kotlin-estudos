package article

data class User(var id:Int,var name: String,var state: String)

val user = User(1,"Bruno","SP")
val anotherUser = User(2,"Matheus","RJ")


fun main() {
    println(user)
}


