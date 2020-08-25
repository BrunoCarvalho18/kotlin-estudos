/*
Type      Bit
Double    64
Float     32
Long      64
Int       32
Short     16
Byte      8
Boolean   ?
String    ?
Char      ?
 */


/*
1 Byte = 8 bits
1 kilobyte(kb) = 1024 bytes
1 megabyte(mb) = 1024 kilobytes
1 gigabyte(gb) = 1024 megabytes
 */


fun main(){
   var nome: String = "Bruno Carvalho Sa"
   var idade:Int=13

   var character: Char= 'h'

   println("Double: Max: " + Double.MAX_VALUE + "- Double: " + Double.MIN_VALUE)
   println("Float: Max: "  + Float.MAX_VALUE + "- Min: " + Float.MIN_VALUE)
   println("Long: Max: "   + Long.MAX_VALUE + "- Long: " + Long.MIN_VALUE)
   println("Int: Max: " +  Int.MAX_VALUE + "- Min: " + Int.MIN_VALUE)
   println("Short: Max: " +  Short.MAX_VALUE + "- Min: " + Short.MIN_VALUE)
   println("Byte: Max: " +  Byte.MAX_VALUE + "- Min: " + Byte.MIN_VALUE)

   // Variáveis  mutáveis
   var nome2 = "José da Silva"
   nome = "João da silva 2"

   //Variáveis imutáveis
   val idade2=10
   println(idade2)

   val frase = "Kotlin é uma linguagem"
   val caracteristica= " show!"
   println(frase + caracteristica)
   println("Kotlin é uma linguagem $caracteristica")

   val str = """sekjfsjfs he rsffa seth
      |hts th srtj rtj rjt
      |srt jrtj rtj erj
      |     tsvd gaer herh yket y etn
   """.trimMargin()
   println(str)

   println("Kotlin é uma linguagem ${caracteristica.length}")



}