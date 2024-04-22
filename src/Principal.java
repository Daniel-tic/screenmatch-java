public class Principal {
    public static void main(String[] args) {
        // del lado izquierdo es el tipo de dato asi como String seria Pelicula
        Pelicula miPelicula = new Pelicula(); // creando una instancia del objeto pelicula
        miPelicula.nombre = "Encanto";
        miPelicula.fechaDeLanzamiento = 2021;
        miPelicula.duracionEnMinutos = 120;
//      llamamos la clase que declaramos en pelicula,js
        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);

        System.out.println(miPelicula.sumaDeLasEvaluaciones);
        System.out.println(miPelicula.totalDelasEvaluaciones);
        System.out.println(miPelicula.calculaMedia());

//        System.out.println("Mi peli es: " + miPelicula.nombre);
//        System.out.println("Su fecha de lanzamiento es: " + miPelicula.fechaDeLanzamiento);

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "Matrix";
        otraPelicula.fechaDeLanzamiento = 1998;
        otraPelicula.duracionEnMinutos = 180;

        otraPelicula.muestraFichaTecnica();

//        System.out.println("Mi  otra peli es: " + otraPelicula.nombre);
//        System.out.println("Su fecha de lanzamiento es: " + otraPelicula.fechaDeLanzamiento);
    }
}
