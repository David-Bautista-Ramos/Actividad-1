//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Constantes {
    companion object {
        const val PI = 3.14159
    }
}

var edad: Int? = 87

fun saludar(nombre: String, saludo: String = "hola") {
    println("$saludo $nombre")
}

fun main() {
    val count: Int = 10
    println("El valor guardado en la variable count = $count.")

    var nombre: String = "Juan"
    nombre = "Pedro"
    println("El nombre guardado en la variable nombre es = $nombre")

    println("El valor de PI es: ${Constantes.PI}")

    saludar("David")
    saludar("Maria", "Hi")
    saludar("Cata")

    if (edad != null) {
        println("El valor de edad es $edad")
    } else {
        println("El valor de edad es null")
    }
}
