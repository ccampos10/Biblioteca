package Libros;

public class nodoSimple {
    String Dato;
    private nodoSimple siguiente;

    public nodoSimple(String Dato) {
        this.Dato = Dato;
        this.siguiente = null;
    }

    public String getDato() {
        return Dato;
    }

    public void setDato(String Dato) {
        this.Dato = Dato;
    }

    public nodoSimple getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodoSimple siguiente) {
        this.siguiente = siguiente;
    }
}
