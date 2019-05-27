package preguntas

class Respuesta {

    static belongsTo = [pregunta:Pregunta]
    //static belongsTo = Usuario

    String texto
    //Pregunta pregunta
    //String autor
    Date fecha

    static constraints = {
    }
}
