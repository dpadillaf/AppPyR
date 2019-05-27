package preguntas

class Usuario {

    static hasMany = [preguntas:Pregunta]
    static mapping = { preguntas fetch:"join" }
    //static hasMany = [respuestas:Respuesta]

    String nombre
    String email

    static constraints = {
        nombre(size:3..50)
        email(email:true)
    }
}
