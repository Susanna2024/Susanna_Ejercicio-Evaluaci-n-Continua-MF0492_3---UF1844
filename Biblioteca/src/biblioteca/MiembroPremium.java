/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

import java.util.ArrayList;
import java.util.List;

// Clase MiembroPremium que hereda de Usuario
public class MiembroPremium extends Usuario {
    private List<Libro> librosReservados; // Lista de libros reservados por el usuario

    // Constructor para inicializar el nombre del miembro premium y la lista de libros reservados
    public MiembroPremium(String nombre) {
        super(nombre); // Llamada al constructor de Usuario
        this.librosReservados = new ArrayList<>(); // Inicializa la lista vacía de libros reservados
    }

    // Método para reservar un libro
    public void reservarLibro(Libro libro) {
        if (!libro.estaDisponible()) {
            librosReservados.add(libro); // Añade el libro a la lista de reservas
            System.out.println("Libro reservado: " + libro.getTitulo());
        } else {
            boolean prestado = tomarPrestado(libro.getTitulo()); // Llama al método del padre
            if (prestado) {
                System.out.println("Libro prestado directamente: " + libro.getTitulo());
            }
        }
    }

    // Método para obtener la lista de libros reservados
    public List<Libro> getLibrosReservados() {
        return librosReservados; // Devuelve la lista de libros reservados
    }

    // Método para cambiar la lista de libros reservados
    public void setLibrosReservados(List<Libro> nuevosLibrosReservados) {
        this.librosReservados = nuevosLibrosReservados; // Cambia la lista de libros reservados
    }
}

