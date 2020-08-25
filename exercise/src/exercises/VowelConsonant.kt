package exercises

fun countVowels(phrase: String):Int{
     val VOEWLS = "aeiou"
     var totalVoewls = 0

     for(letter in phrase){
         if(letter.toLowerCase() in VOEWLS) totalVoewls++
     }
     return totalVoewls
}

fun countConsonants(phrase: String):Int{
     val CONSONANTS= "bcdfghjklmnpqrstvwxyz"
     var totalConsonants = 0

     for(letter in phrase){
          if(letter.toLowerCase() in CONSONANTS) totalConsonants++
     }
     return totalConsonants
}

fun CountVolwesFilter(phrase: String)= phrase.filter { it.toLowerCase() in "aeiou"}.length