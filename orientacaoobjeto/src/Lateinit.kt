class PessoaLateInit{
    lateinit var nome: String

    fun geradorDeNome(){
        nome = "dfugbd"
    }
}

fun main(){

    val p = PessoaLateInit()
    p.geradorDeNome()
}