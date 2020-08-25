package moreclasses

sealed class Result{
    class Success(val message: String) : Result()
    class Error(val message: String, val erroCode: Int) : Result()
}

class Repo(){
    fun execute() : Result{
        return Result.Success("Deu certo!")
    }
}

fun main(args: Array<String>) {

    val r1= Repo()
    val result: Result = r1.execute()
    when (result){
        is Result.Success->{
            println("Deu sucesso")
        }
        is Result.Error->{
            println("Deu erro")
        }
    }

}