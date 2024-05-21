package com.aluracursos.screenmatch.modelos;
//herencia  serie es un titulo,hereda
public class Serie extends Titulo {
    private int temporadas;
    private int episodiosPorTemporada;
    private int minutoPorEpisodio;

    @Override //es sobre escritura de metodos
    public int getDuracionEnMinutos() {
        return temporadas* episodiosPorTemporada * minutoPorEpisodio;
        //return super.getDuracionEnMinutos(); //  retorna de la clase madre(titulo)
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutoPorEpisodio() {
        return minutoPorEpisodio;
    }

    public void setMinutoPorEpisodio(int minutoPorEpisodio) {
        this.minutoPorEpisodio = minutoPorEpisodio;
    }
}
