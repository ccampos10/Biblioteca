package Autores;

import Libros.Libros;

public class Autores {
    private NodoDoble inicio;
    private NodoDoble fin;

    public Autores() {
        this.inicio = null;
        this.fin = null;
    }

    public void CrearAutor(String nombreAutor) {
        NodoDoble nuevo = new NodoDoble(nombreAutor);

        if (inicio == null) {  // Si la lista está vacía
            inicio = nuevo;
            fin = nuevo;
        } else {  // Si la lista no está vacía
            nuevo.setAnterior(fin);
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }

    public void EditarAutor(String nombreActual, String nuevoNombre) {
        NodoDoble actual = inicio;
        boolean encontrado = false;

        while (actual != null && !encontrado) {
            if (actual.getDato().equalsIgnoreCase(nombreActual)) {
                actual.setDato(nuevoNombre);
                encontrado = true;
                System.out.println("Nombre del autor modificado correctamente.");
            }
            actual = actual.getSiguiente();
        }

        if (!encontrado) {
            System.out.println("El autor con nombre '" + nombreActual + "' no existe en la lista.");
        }
    }
    
    public void EliminarAutor(String nombreAutor, Libros libros) {
        if (libros.estaAsociadoAutor(nombreAutor)) {
            System.out.println("No se puede eliminar el autor '" + nombreAutor + "' porque está asociado a un libro.");
            return;
        }

        NodoDoble actual = inicio;
        NodoDoble anterior = null;
        boolean encontrado = false;

        while (actual != null && !encontrado) {
            if (actual.getDato().equalsIgnoreCase(nombreAutor)) {
                if (actual == inicio && actual == fin) { // Caso 1: Único nodo en la lista
                    inicio = null;
                    fin = null;
                } else if (actual == inicio) { // Caso 2: Nodo a eliminar es el primero
                    inicio = inicio.getSiguiente();
                    inicio.setAnterior(null);
                } else if (actual == fin) { // Caso 3: Nodo a eliminar es el último
                    fin = fin.getAnterior();
                    fin.setSiguiente(null);
                } else { // Caso 4: Nodo a eliminar está en medio
                    anterior.setSiguiente(actual.getSiguiente());
                    actual.getSiguiente().setAnterior(anterior);
                }
                encontrado = true;
                System.out.println("Autor eliminado correctamente.");
            }
            anterior = actual;
            actual = actual.getSiguiente();
        }

        if (!encontrado) {
            System.out.println("El autor con nombre '" + nombreAutor + "' no existe en la lista.");
        }
    }
    
    public void MostrarListaAutores() {
        NodoDoble actual = inicio;

        if (actual == null) {
            System.out.println("No hay autores ingresados en la lista.");
        } else {
            System.out.println("Lista de autores:");
            while (actual != null) {
                System.out.println(actual.getDato());
                actual = actual.getSiguiente();
            }
        }
    }

    public boolean existe(String autor){
        NodoDoble actual = inicio;
        while (actual != null) {
            if (actual.getDato().equalsIgnoreCase(autor)) return true;
            actual = actual.getSiguiente();
        }
        return false;
    }

}

