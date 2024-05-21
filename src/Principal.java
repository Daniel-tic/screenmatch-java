import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        // del lado izquierdo es el tipo de dato asi como String seria com.aluracursos.screenmatch.modelos.Pelicula
        Pelicula miPelicula = new Pelicula(); // creando una instancia del objeto pelicula
        miPelicula.setNombre("Encantoo");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);
//      llamamos la clase que declaramos en pelicula,js
        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);

        System.out.println(miPelicula.getTotalDelasEvaluaciones()); //modificadores de acceso get
        System.out.println(miPelicula.calculaMedia());

        Serie casaDragon = new Serie(); // nueva instancia de Serie
        casaDragon.setNombre("La casa del Dragon");
        casaDragon.setFechaDeLanzamiento(2002);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutoPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Matrix");
        otraPelicula.setFechaDeLanzamiento(1998);
        otraPelicula.setDuracionEnMinutos(180);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();// creamos una instancia variable calculadora
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo para ver todas la peliculas: "+ calculadora.getTiempoTotal());

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);//dentro de pelicula esta  el metodo geclasificacion q se usara para filtrar

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("primer capitulo");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);

        filtroRecomendacion.filtra(episodio);



        System.out.println("Mi peli es: " + miPelicula.getNombre());
        System.out.println("Su fecha de lanzamiento es: " + miPelicula.getFechaDeLanzamiento());


        //otraPelicula.muestraFichaTecnica();

        System.out.println("Mi  otra peli es: " + otraPelicula.getNombre());
        System.out.println("Su fecha de lanzamiento es: " + otraPelicula.getFechaDeLanzamiento());
    }
}
