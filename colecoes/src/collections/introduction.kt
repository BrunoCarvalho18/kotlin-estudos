package collections

fun main(args: Array<String>) {

    // List - array, Set,HashMap

    val l1= listOf("Madrid","São Paulo","Berlim")
    var l2 = mutableListOf("Madrid","São Paulo","Berlim")
    val a1 = arrayListOf("Madrid","São Paulo","Berlim")

    val s1 = setOf("Madrid","São Paulo","Berlim","Berlim")
    val s2 = mutableSetOf("Madrid","São Paulo","Berlim","Berlim")

    val h1= hashMapOf<String,String>(Pair("key","value"),Pair("França","Paris"))

    val m1= mapOf(Pair("key","value"),Pair("França","Paris"))
    val m2= mutableMapOf(Pair("key","value"),Pair("França","Paris"))

    println(h1.entries)
}