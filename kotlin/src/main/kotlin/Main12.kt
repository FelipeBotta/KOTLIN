fun bonus(cargo:String){
    if (cargo == "Gerente"){
        println("Seu bônus é de R$ 2.000,00")
        if (cargo == "Coordenador"){
            println("Seu bônus é de R$ 1.500,00")
        }
        if (cargo == "Engenheiro"){
            println("Seu bônus é de R$ 1.000,00")
        }
    }else if (cargo == "Estagiario"){
        println("Seu bônus é de R$ 500,00")
    }
}

fun bonusTempo(cargo1:String, tempo:Int){
    if (cargo1 == "Gerente" && tempo <= 2){
        println("O bônus é de R$ 2.000,00")
        if (cargo1 == "Gerente" && tempo >= 2){
            println("O bônus é de R$ 3.000,00")
        }
        if (cargo1 == "Coordenador" && tempo < 1){
        println("O bônus é de R$ 1.500,00")
        }
        if (cargo1 == "Coordenador" && tempo >= 1){
            println("O bônus é de R$ 1.800,00")
        }
        if (cargo1 == "Engenheiro"){
            println("Seu bônus é de R$ 1.000,00")
        }
    }else if (cargo1 == "Estagiario"){
        println("Seu bônus é de R$ 500,00")
    }
}
fun main() {
    bonus("Estagiario")
    bonusTempo("Gerente", 3)
}