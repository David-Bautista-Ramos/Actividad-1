# Documentacion

###Temas Buscados
------------------------------------------------------------------
- Variables

- Constantes

- Opcionales

- Manejos de Nulos
--------------------------------------------------------------------------

## Variables
Variable en es como un contenedor o espacio en la memoria de una computadora donde se almacenan distintos tipos de datos durante la ejecución de un programa. Estas son algunas características clave de las variables:
- Nombre único: Cada variable tiene un identificador único dentro del programa.

- Valor almacenado: Puede cambiar durante la ejecución del programa.

- Tipo de datos: Puede almacenar números, textos, estados booleanos, entre otros.

- Alcance: Puede ser global (accesible desde cualquier parte del programa) o local (solo accesible dentro de un bloque de código).

- `val` se uiliza para declarar variables cuyo valor no puede cambiar una vez asignado.
- `var` se utiliza para declarar variables cuyo valor puede ser modificado.

###Ejemplo:

	val count: Int = 10
    println("El valor guardado en la variable count = $count.")

    var nombre: String = "Juan"
    nombre = "Pedro"
    println("El nombre guardado en la variable nombre es = $nombre")

###Explicacion del Codigo

- En la primera linea se esta creando un `val` (variable de solo lectura,inmutable) que tiene como nombre `count` y se especifica que tipo de datos va a almacenar en este caso es un entero `int` , esta variable se le asigna un valor a guardar que es 10.

 Para mirar que lo anterior esta correcto usamos un `println` que lleva un    mensaje y accedemos al valor que tiene la variable usando `$`

- En el segudo codigo se creo un `var`(variable mutable) que tiene como nombre `nombre` y se especifica que tipo de datos va a almacenar en este caso es caracteres `String`, esta variable se le asigno un dato el cual es Juan.

 Despues para poder ver que los `var` son mutables incertamos un nuevo  dato a la variable el cual es Pedro

 Como ultimo paso se creo un `println` que lleva un mensaje y se accede a su dato usando `$`, para ver si al momento de mostrar el mensaje el primner dato de la variable fue sustituido por el incertado

##Constantes
Una constante es un valor fijo que un programa no puede modificar mientras se está ejecutando

###Ejemplo:

	class Constantes {
    companion object {
        const val PI = 3.14159
    }
    }
	println("El valor de PI es: ${Constantes.PI}")

###Explicacion del Codigo

- En este ejemplo se creo una clase la cual se llama `Constantes` y dentro de ella se creo `companion object` Un objeto compañero permite que los miembros de este objeto se comporten como miembros estáticos en lenguajes como Java para posterior ser llamado sin necesidad de tener una instancia de la clase, dentro del `companion object` creamos la constante, la cual se crea como una variable pero con una adicion al inicio llamada `const` que nos indica que esa variable es una constante

 para comprobar si funciona, hacemos un mensaje de salida `println` el cual lleva un mensaje y para traer la constante debemos llamar primero la clase `Constantes` seguido por un punto `.` y el nombre de la constante `PI` el cual nos mostrara el mensaje con el valor de la constante `PI`

##Opcionales 

Los parámetros opcionales nos permiten hacer la invocación de funciones o métodos más flexible, al permitirnos omitir ciertos argumentos si no queremos proporcionarlos. La clave de esta funcionalidad es el valor predeterminado que se utiliza cuando no se especifica el argumento.

###Ejemplo:

	fun saludar(nombre: String, saludo: String = "hola") {
    	println("$saludo $nombre")
	}
    saludar("David")
    saludar("Maria", "Hi")
    saludar("Cata")

###Explicacion del Codigo

- Primero se empieza creando la funcion en este caso se llama `saludar` que recibe dos argumentos, y uno es `nombre` tiene como tipo de dato `String` que almacena cadena de caracteres igual que el segundo argumento nombrado `saludo` con la diferencia de que a este se le da un valor desde el inicio el cual es `hola`, tambien en la funcion podemos encontrar un  `println` el cual al momento de mostrar el mensaje va trarer el valor que tenga los argumentos `nombre` y `saludo`

 Esta funcion a la hora de recibir datos se va a ejecutar y mostrara en el  
 - primera envio de datos `hola David`
 - segundo envio de datos `Hi Maria`
 - tercero envio de datos `hola Cata`

 La razon por la que en la segunda no dice hola es por que estamos enviando un dato al argumento saludo, cosa que en el primero y segundo no se hizo, por esa es que dependiendo de lo que se le envie a la funcion ella tendra varias opciones de responder

##Manjeo de Nulos

En Kotlin, los valores nulos son manejados de manera segura para evitar errores de NullPointerException. Esto se logra mediante el uso del operador ? y el operador de elvis ?:, así como la función let. Una variable en Kotlin puede tener el valor de null, sólo si se declara con el operador de signo de interrogación ?.


###Ejemplo:

	var edad: Int? = 87
	 if (edad != null) {
        println("El valor de edad es $edad")
    } else {
        println("El valor de edad es null")
    }

###Explicacion del Codigo

- Para comenzar se crea la variable mutable `var` y se le da un nombre
el cual es `edad` y tiene un tipo de dato entero acompañado de un elvis `?` para que esta variable pueda recibir nulos

 Para ternimar de mejorar el manejo se creo una condicion que me permite sabe si ese dato esta `null` o tiene algun dato
