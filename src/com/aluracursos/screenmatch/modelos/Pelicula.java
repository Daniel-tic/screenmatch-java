package com.aluracursos.screenmatch.modelos;

public class Pelicula {
    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
//    aniadimos una nueva variable al negocio
    private double sumaDeLasEvaluaciones;
    private int totalDelasEvaluaciones;

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public void setNombre(String nombre) { // set para poner datos
        this.nombre = nombre; //this, nos referimos al atributo de la clase (pelicula)
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public int getTotalDelasEvaluaciones() { //get para obtener datos
        return totalDelasEvaluaciones;
    }

    //no retorna nada x eso es void
    public void muestraFichaTecnica (){
        System.out.println("El nombre de la peli es: " + nombre);
        System.out.println("Su fecha de lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("Duracion en minutos: "+ duracionEnMinutos);
    }
//recibe  valores de nota
    public void evalua( double nota) {
        sumaDeLasEvaluaciones += nota;
        totalDelasEvaluaciones++;
//        es lo mismo que de abajo
//        sumaDeLasEvaluaciones = sumaDeLasEvaluaciones + nota;
    }
    public double calculaMedia(){
        return sumaDeLasEvaluaciones/totalDelasEvaluaciones;
    }

}
