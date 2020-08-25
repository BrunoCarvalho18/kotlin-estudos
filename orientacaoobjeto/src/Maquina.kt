class MaquinaDois(var marca: String){

    var nucleos: Int =0
       get(){
           println("Get foi chamado")
           return field
       }
       set(value){
           println("Set foi chamado")
           field=value
       }

}

fun ligar(){

}

fun processar(){

}

fun desligar(){

}

fun main(){
    var m = MaquinaDois("xpto")

    with(m){
        ligar()
        processar()
        desligar()
    }

    println(m.nucleos)
    m.nucleos = 10
}