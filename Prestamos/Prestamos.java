package Prestamos;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import Libros.*;

public class Prestamos {
    private static Queue<nodoSimple> prestamos = new LinkedList<>();
    private static Libros libros;

    public static void setLibros(Libros librosPun){
        libros = librosPun;
    }

    public static void prestarLibro(String titulo) {
        nodoSimple libro = libros.buscar(titulo);
        if (libro == null) System.out.println("Libro no disponible para préstamo.");

        prestamos.offer(libro);
        System.out.println("Libro prestado: " + titulo);
    }

    public static void devolverLibro(String titulo) {
        for (nodoSimple libro : prestamos) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                prestamos.remove(libro);
                System.out.println("Libro devuelto: " + libro.getTitulo());
                return;
            }
        }
        System.out.println("Libro no encontrado en los préstamos.");
    }

    public static void mostrarPrestamos() {
        if (prestamos.isEmpty()) {
            System.out.println("No hay libros prestados actualmente.");
        } else {
            System.out.println("Libros prestados:");
            for (nodoSimple libro : prestamos) {
                System.out.println(libro.getTitulo());
            }
        }
    }

    public static void mostrarLibrosDisponibles() {
        boolean flag = false;
        List<nodoSimple> librosLista = libros.getLibros();
        for (nodoSimple libro : librosLista){
            boolean estaPrestado = false;
            for (nodoSimple libroPrestado : prestamos) {
                if (libro.getTitulo().equalsIgnoreCase(libroPrestado.getTitulo())) estaPrestado = true;
            }
            if (!estaPrestado){
                System.out.println(libro.getTitulo());
                flag = true;
            }
        }

        if (!flag) System.out.println("No hay libros disponibles.");
    }
}
