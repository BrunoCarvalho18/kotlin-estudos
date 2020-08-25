fun media(vararg notas: Float){

    if(notas.isNotEmpty()){
        var soma = 0f
        for(nota in notas){
            soma +=nota
        }
        println("A média é: ${soma/notas.size}")
    }
}

fun <T> media(vararg valores:T){
    for(valor in valores){
        println(valor)
    }
}

fun main(){
    //media(10f,8f)
    //media(1f,5f,2f,7f)

   // media(1,4f,"",false,"",'C')

    val str ="lorem ipsum"
    str.capitalize()
    str.decapitalize()
    str.contains("bla")
    str.startsWith("l")
    str.startsWith("L")

    arrayOf(1,2,3,7,3,5,3)
}