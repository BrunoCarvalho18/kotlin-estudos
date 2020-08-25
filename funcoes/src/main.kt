fun calculaBonus(a: Int,b: Int,c: Int){
   println("O bônus é: ${a+b*c}")
}

fun hello(nome: String) : String{
   return "Olá, $nome"
}

//Função de 1 linha
fun hello2(nome: String): String = "Olá, $nome"

//Função Soma
fun soma(a:Int, b:Int) = a + b

fun main(){

    val a = 10
    val b = 20
    val c = 30

    calculaBonus(a,b,c)

    println(hello("Bruno"))
    println(hello2("Gabriel"))
    println(soma(2,2))
}

