package article

data class Shape(var width: Float, var height: Float){
    fun slice(times: Int): Float {
        return (this.width * height) / times
    }
}

val shape = Shape(10f,10f)

fun main() {
    println(shape.slice(2))

    shape.slice(2)
    shape.width = 3f
    shape.height= 4f

    print(shape.slice(2))
}

