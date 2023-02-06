fun main() {
    //fun anos (a: Int) {

    val str = "Como descobrir o tamanho da String"

    println("Tamanho da String: ${str.length}")

    println(cubica(3))

    println(milha(5f))
}


fun cubica (a: Int):Int {
    return (a * a * a)
}

fun milha (a: Float): Float{
    return a * (1.6f)
}




