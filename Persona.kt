class Persona(val nombre: String = "Jane", val apellido: String = "Doe") {


    var nick: String? = null    //las variables en kotlin ya cuentan con getters y setters implicitos

    init{   //se ejecuta este codigo cada vez que se crea una nueva instancia de este objeto

        println("Init 1")

    }

    fun printInfo(){
        println("Nombre: $nombre , Apellido: $apellido")
    }

}