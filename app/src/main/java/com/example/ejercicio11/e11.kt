package com.example.ejercicio11

class e11 {

    fun main() {
        var nro1 = 10
        val nro2 = 33
        val nro3 = 66

        var resultado = nro1 + nro2 + nro3

        println("El resultado de las variables declaradas es $resultado")

        nro1 = 55

        resultado = nro1 + nro2 + nro3

        println("El resultado de las variables declaradas es $resultado")

        var promedio = resultado / 3

        println("El promedio de las variables declaradas es $promedio")

    }
}

fun profile() {
    val amanda = Person("Amanda", 33, "Tennis", null)
    val atiqah = Person("Atiqah", 28, "Climb", amanda)
    amanda.showProfile()
    atiqah.showProfile()
}
class Person (val name: String, val age: Int, val hobby: String, val referrer: Person?) {
    fun showProfile() {
        println ("Name: $name")
        println ("Age: $age")
        println ("Likes to $hobby")
        if (referrer==null){
            println("Doesn't have a referrer")
        }else {
            println("Has a referred named ${referrer.name}")
        }
    }
}



