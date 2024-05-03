/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

import java.util.ArrayList;
import java.util.List;

// Clase Autor que contiene nombre y lista de libros
public class Autor {
    private String nombre;
    private List<Libro> libros; // Lista de libros del autor

    // Constructor para inicializar el nombre del autor y su lista de libros
    public Autor(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>(); // Inicializa una lista vacía de libros
    }

    // Método para obtener el nombre del autor
    public String getNombre() {
        return nombre;
    }

    // Método para obtener la lista de libros del autor
    public List<Libro> getLibros() {
        return libros;
    }

    // Método para añadir un libro a la lista del autor
    public void publicarLibro(Libro libro) {
        this.libros.add(libro); // Añade el libro a la lista del autor
    }
}
