open class Maquina(val marca: String){
    open fun minhaMarca(){
       println("Minha marca é $marca")
    }
}

class Computador(marca: String, val nucleos:Int) : Maquina(marca){

    override fun minhaMarca(){
        val id = 10;
        super.minhaMarca()
    }

    fun ligar(){}
    fun processar(){}

    //Sobrecarga
    fun overload(i:Int) = println("Overload 1")
    fun overload(i: Int,s:String) = println("Overload 2")
    fun overload(i:Int, b:Boolean) = println("Overload 2")

    private fun validate(){

    }
}

fun main(){
    val c: Computador = Computador("xpto",10)
    with(c){
        ligar()
        processar()
        minhaMarca()
        overload(10,"")
        overload(10)
        overload(10,false)
    }
}