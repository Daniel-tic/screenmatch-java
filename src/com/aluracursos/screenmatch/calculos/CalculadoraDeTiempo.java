package com.aluracursos.screenmatch.calculos;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {
    private  int tiempoTotal;

    public int getTiempoTotal() { //get xq necesitamos obtener el tiempo total, set no xq el tiempo es un calculo no algo q ponemos de una ves
        return tiempoTotal;
    }

    public void incluye(Titulo titulo){//hacemos referencia a la clase Pelicula y le llamamos pelicula
        this.tiempoTotal += titulo.getDuracionEnMinutos();

    }
    //polimorfismo,uno de los pilares de la POO

}
