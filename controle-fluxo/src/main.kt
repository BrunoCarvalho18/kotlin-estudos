fun calculaBonus(cargo: String, salario: Float): Float {
    // Gerente Junior, Gerente Senior, Coordenador

    return if (cargo=="Coordenador"){
         salario * 0.2f
    }else if(cargo=="Gerente Junior"){
         salario *0.5f
    } else{
         salario * 2
    }

}

//if - else
fun maiorDeIdade(idade: Int):Boolean{
   return idade >= 18
}

fun main(){
    println(calculaBonus("Coordenador",1000f))

    //Operador Elvis
    val test: Int? = null
    val op:Int = test ?: 100
    print(op)

}