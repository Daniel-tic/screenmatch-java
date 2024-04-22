public class Pelicula {
    String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
//    aniadimos una nueva variable al negocio
    double sumaDeLasEvaluaciones;
    int totalDelasEvaluaciones;

    //no retorna nada x eso es void
    void muestraFichaTecnica (){
        System.out.println("El nombre de la peli es: " + nombre);
        System.out.println("Su fecha de lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("Duracion en minutos: "+ duracionEnMinutos);
    }
//recibe  valores de nota
    void evalua( double nota) {
        sumaDeLasEvaluaciones += nota;
        totalDelasEvaluaciones++;
//        es lo mismo que de abajo
//        sumaDeLasEvaluaciones = sumaDeLasEvaluaciones + nota;
    }
    double calculaMedia(){
        return sumaDeLasEvaluaciones/totalDelasEvaluaciones;
    }

}
