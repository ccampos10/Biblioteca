package Categorias;

import Libros.Libros;

public class Categorias {
    Arbol arbol;

    public Categorias() {
        this.arbol = new Arbol();
    }

    public void anadirCategoria(String nombre) {
        boolean res = arbol.anadirNodo(nombre);
        if (res) System.out.println("Categoria agregada correctamente");
        else System.out.println("La categoria '" + nombre + "' ya existe");
    }

    public void cambiarNombre(String nombre, String nombreAntiguo) {
        Boolean res = arbol.editar(nombre, nombreAntiguo);
        if (res) System.out.println("Categoria cambiada correctamente");
        else System.out.println("La categoria '" + nombreAntiguo + "' no existe");
    }

    public void eliminarCategoria(String nombre, Libros libros) {
        if (libros.estaAsociadoCategoria(nombre)) {
            System.out.println("No se puede eliminar la categoria '" + nombre + "' por que esta asociada a un libro");
            return;
        }
        Boolean res = arbol.eliminar(nombre);
        if (res) System.out.println("Categoria eliminada correctamente");
        else System.out.println("La categoria '" + nombre + "' no existe");
    }
    public void mostrarCategorias() {
        arbol.mostrarDatos();
    }
    public boolean existe(String nombre){
        return arbol.existe(nombre);
    }
}
