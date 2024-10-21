public class Main {
    public static void main(String[] args) {
        // Creación del libro
        Libro libro = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967);
        libro.mostrarInfo();

        // Prestar el libro
        libro.prestar();
        libro.mostrarInfo();

        // Devolver el libro
        libro.devolver();
        libro.mostrarInfo();

        // Actualizar la información del libro (con el nuevo estado)
        libro.actualizarInfo("El amor en los tiempos del cólera", "Gabriel García Márquez", 1985, true);
        libro.mostrarInfo();
    }
}
