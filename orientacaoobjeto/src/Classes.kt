class Pessoa

class Pessoa2(var nome: String, var anoNascimento: Int)

class Pessoa3(var nome: String){

    var ano: Int? = null

    constructor(nome:String,ano:Int) : this(nome){
        this.ano=ano
    }

    fun saudacao(){
        println("Olá, meu nome é $nome e nasci em $ano")
        println(ano)
    }
}

fun main(){
    
    val p2: Pessoa3 = Pessoa3("Bruno",1995)
    val p1 : Pessoa3 = Pessoa3("Matheus")

    p1.saudacao()
    p2.saudacao()


}