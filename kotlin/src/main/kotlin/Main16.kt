fun quadrado(){
    print("Informe o primeiro valor:")
    val lado1 = readLine()

    print("Informe o segundo valor:")
    val lado2 = readLine()

    if (lado1 != null && lado2 != null){
        val x = lado1.toInt()
        val y = lado2.toInt()

        if (x == y){
            println("Quadrado !")
        } else{
            println("Retângulo !")
        }
    }
}

fun triangulo(){
    print("Informe o primeiro valor:")
    val lado1 = readLine()

    print("Informe o segundo valor:")
    val lado2 = readLine()

    print("Informe o terceiro valor:")
    val lado3 = readLine()

    if(lado1 != null && lado2 != null && lado3 != null){
        val x = lado1.toInt()
        val y = lado2.toInt()
        val z = lado3.toInt()

        if (x == y && y == z){
            println("Equilátero")
        } else{
            println("Isóceles ou escaleno")
        }
    }

}


fun main() {
    quadrado()
    triangulo()
}