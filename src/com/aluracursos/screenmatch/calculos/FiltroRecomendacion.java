package com.aluracursos.screenmatch.calculos;

public class FiltroRecomendacion {

    public void filtra(Clasificacion clasificacion){
        if(clasificacion.getClasificacion() >= 4){
            System.out.println("Esta muy bien evaluado");
        } else if (clasificacion.getClasificacion() >= 2) {
            System.out.println("Popular en el momento");
        } else {
            System.out.println("Colocolalo en Ver mas Tarde ;)");
        }
    }
}
