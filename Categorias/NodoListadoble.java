package Categorias;

import Libros.Libros;
import Libros.Libro;

class NodoListaDoble {
    String dato;
    Libros libros;
    NodoListaDoble siguiente;
    NodoListaDoble anterior;

    public NodoListaDoble(String dato){
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
        this.libros = new Libros();
    }
    
    public String getDato(){
        return dato;
    }
    public NodoListaDoble getSiguiente(){
        return siguiente;
    }
    public NodoListaDoble getAnterior(){
        return anterior;
    }
    public boolean tieneLibrosAsociados(){
        return libros.estaVacio();
    }

    public void setDato(String dato){
        this.dato = dato;
    }
    public void setSiguiente(NodoListaDoble siguiente){
        this.siguiente = siguiente;
    }
    public void setAnterior(NodoListaDoble anterior){
        this.anterior = anterior;
    }
    public void setLigro(Libro lib){
        this.libros.agregarLibro(lib);
    }

}
