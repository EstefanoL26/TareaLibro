public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean estado; // true = disponible, false = prestado

    // Constructor
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.estado = true; // Disponible por defecto
    }

    // Mostrar información del libro
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicación: " + anioPublicacion);
        System.out.println("Estado: " + (estado ? "Disponible" : "Prestado"));
    }

    // Prestar el libro
    public void prestar() {
        if (estado) {
            estado = false;
            System.out.println("El libro ha sido prestado.");
        } else {
            System.out.println("El libro ya está prestado.");
        }
    }

    // Devolver el libro
    public void devolver() {
        if (!estado) {
            estado = true;
            System.out.println("El libro ha sido devuelto.");
        } else {
            System.out.println("El libro ya está disponible.");
        }
    }

    // Actualizar información del libro (con opción de cambiar estado)
    public void actualizarInfo(String nuevoTitulo, String nuevoAutor, int nuevoAnioPublicacion, boolean nuevoEstado) {
        this.titulo = nuevoTitulo;
        this.autor = nuevoAutor;
        this.anioPublicacion = nuevoAnioPublicacion;
        this.estado = nuevoEstado; // Permite cambiar el estado al actualizar
        System.out.println("Información del libro actualizada.");
    }

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

        // Actualizar la información del libro y estado a "Prestado"
        libro.actualizarInfo("El amor en los tiempos del cólera", "Gabriel García Márquez", 1985, false);
        libro.mostrarInfo();
    }
}
