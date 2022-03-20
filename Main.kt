
val pi: Double = 3.1415 //variable global
var miNull: String? = null // para permitir null como valor , hay que agregar el ?
val unString = "Hola"        //kotlin puede entender solo de que tipo es la variable

fun main() {

    val name: String = "Paolo"   //variables de tipo val solo se les puede pasar un valor, no cambian

    var age: Int = 23

    println(name)
    println(miNull)
    miNull = "Un string"

    if(miNull != null){
        println(miNull)
    }else{
        println("Es null")
    }

    //when, muy similar a switch

    miNull = null
    when(miNull){
        null -> println("Variable null")
        else -> println(miNull)
    }

    println(miFun())
    otraFun()
    parametrosEnFunc("Buenas tardes", parametro2 = "Segundo Parametro")
    var miArray = arrays()

    println(miArray[2])

    for(elemento in miArray){

        println(elemento)

    }

    miArray.forEach { elemento ->
        println(elemento) //it es el nombre por defecto de los elementos de esta funcion forEach, pero se puede cambiar
    }
    miArray.forEachIndexed{ index, elemento ->

        println("$elemento en el index $index")

    }

    val map = mutableMapOf("primer llave" to "primer valor", "segunda llave" to "segundo valor")//al ser mutable, puedo agregar valores
    map.put("tercer llave", "tercer valor")
    map.forEach{ llave, valor ->
        println(llave)
        println(valor)
    }


}

fun miFun(): Int {   //devuelve un Entero

    return 10
}

fun otraFun(): Unit{    //Unit es muy similar al void de java, igualmente no es necesario, ya que se asume Unit de forma automatica
    var unValor: String = "Hola"
    println(unValor)

}

fun parametrosEnFunc(parametro1:String, parametro2:String){

    println("Primer parametro: $parametro1 , Segundo parametro: $parametro2")
}

fun arrays(): Array<String>{

    val arrayDeElementos = arrayOf("Valor", "Otro valor", ":D", "-.-")
    return arrayDeElementos
}