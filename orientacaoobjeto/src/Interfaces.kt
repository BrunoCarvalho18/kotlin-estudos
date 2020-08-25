interface  MaquinaIn{

    fun ligar()
    fun desligar() {
        println("Off")
    }
}

class ComputadorIml: MaquinaIn{
    override fun ligar() {

    }
}

interface  interface1{
    fun ola(){
        println("interface 1")
    }
}

interface interface2{
   fun ola(){
       println("interface 2")
   }
}

class ImplementaInterface : interface1, interface2{
    override fun ola() {
        super<interface1>.ola()
    }
}

fun main(){

}