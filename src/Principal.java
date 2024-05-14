import com.aluracursos.screenmatch.modelos.Pelicula;

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













//        System.out.println("Mi peli es: " + miPelicula.nombre);
//        System.out.println("Su fecha de lanzamiento es: " + miPelicula.fechaDeLanzamiento);

//        com.aluracursos.screenmatch.modelos.Pelicula otraPelicula = new com.aluracursos.screenmatch.modelos.Pelicula();
//        otraPelicula.nombre = "Matrix";
//        otraPelicula.fechaDeLanzamiento = 1998;
//        otraPelicula.duracionEnMinutos = 180;
//
//        otraPelicula.muestraFichaTecnica();

//        System.out.println("Mi  otra peli es: " + otraPelicula.nombre);
//        System.out.println("Su fecha de lanzamiento es: " + otraPelicula.fechaDeLanzamiento);
    }
}
