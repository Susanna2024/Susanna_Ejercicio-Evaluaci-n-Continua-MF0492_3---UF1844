/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

import java.util.ArrayList;
import java.util.List;

// Clase para representar un libro
class Libro {
    private String titulo;
    private Autor autor;
    private boolean disponible;
    private static List<Libro> listaLibros = new ArrayList<>(); // Lista global de libros

    // Constructor para inicializar el libro y agregarlo a la lista global
    public Libro(String titulo, Autor autor, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
        listaLibros.add(this); // Agregar el libro a la lista cuando se crea
    }

    // M�todo para marcar el libro como prestado
    public void marcarPrestado() {
        if (disponible) { // Solo marcar si est� disponible
            this.disponible = false;
        }
    }

  // M�todo para marcar el libro como devuelto
    public void marcarDevuelto() {
        if (!disponible) {
            this.disponible = true; // Cambiar a disponible
        }
    }

    // M�todo para obtener el t�tulo del libro
    public String getTitulo() {
        return titulo; // Devuelve el t�tulo del libro
    }

    // M�todo para obtener la lista global de todos los libros
    public static List<Libro> getListaLibros() {
        return listaLibros; // Devuelve la lista global de libros
    }

    // M�todo para verificar si el libro est� disponible
    public boolean estaDisponible() {
        return disponible; // Devuelve el estado de disponibilidad del libro
    }
}

