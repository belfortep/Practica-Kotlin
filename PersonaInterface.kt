interface PersonaInterface {
    fun printInfo(persona: Persona)
}


class PasandoInterfaz : PersonaInterface {
    override fun printInfo(persona: Persona) {  //es necesaria la palabra override
        println("info")
        persona.printInfo()
    }
}

fun main(){

    val pasandoInterfaz = PasandoInterfaz()

    pasandoInterfaz.printInfo(Persona())

}