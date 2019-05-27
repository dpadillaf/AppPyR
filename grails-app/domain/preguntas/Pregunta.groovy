package preguntas

class Pregunta {

    static hasMany = [respuestas:Respuesta]
    static mapping = { respuestas fetch:"join" }
    static belongsTo = [usuario:Usuario]

    String texto
    //Usuario autor
    Date fecha

    static constraints = {
    }
}
