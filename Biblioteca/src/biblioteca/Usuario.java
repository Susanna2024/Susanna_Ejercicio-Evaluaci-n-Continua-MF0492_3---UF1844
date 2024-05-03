/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;
import java.util.ArrayList;
import java.util.List;


// Clase para representar a un Usuario
public class Usuario {
    private String nombre;
    private List<Libro> libros_prestados; // Lista de libros prestados por el usuario

    // Constructor para inicializar el nombre del usuario y la lista de libros prestados
    public Usuario(String nombre) {
        this.nombre = nombre;
        this.libros_prestados = new ArrayList<>(); // Inicializa la lista vacía de libros prestados
    }

    // Método para obtener el nombre del usuario
    public String getNombre() {
        return nombre;
    }

    // Método para obtener la lista de libros prestados
    public List<Libro> getLibrosPrestados() {
        return libros_prestados;
    }
    
     // Método para cambiar la lista de libros prestados
    public void setLibrosPrestados(List<Libro> nuevosLibrosPrestados) {
        this.libros_prestados = nuevosLibrosPrestados; // Cambia la lista de libros prestados
    }

    // Método para tomar prestado un libro por su nombre
    public boolean tomarPrestado(String nombre_libro) {
        // Buscar el libro en la lista de todos los libros
        for (Libro libro : Libro.getListaLibros()) {
            if (libro.getTitulo().equalsIgnoreCase(nombre_libro) && libro.estaDisponible()) {
                libro.marcarPrestado(); // Cambiar la disponibilidad a falso
                libros_prestados.add(libro); // Añadir a la lista de libros prestados
                return true; // Prestado con éxito
            }
        }
        return false; // No se encontró el libro disponible
    }

    // Método para devolver un libro por su nombre
    public boolean devolverLibro(String nombre_libro) {
        // Buscar el libro en la lista de libros prestados
        Libro libroADevolver = null;

        for (Libro libro : libros_prestados) {
            if (libro.getTitulo().equalsIgnoreCase(nombre_libro)) {
                libroADevolver = libro;
                break; // Una vez encontrado, no es necesario seguir buscando
            }
        }

        if (libroADevolver != null) {
            libroADevolver.marcarDevuelto(); // Cambia la disponibilidad del libro
            libros_prestados.remove(libroADevolver); // Remueve de la lista de prestados
            return true; // Devuelto con éxito
        }

        return false; // No se encontró el libro en la lista de prestados
    }
}

