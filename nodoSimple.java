public class nodoSimple {
    private libros libros;
    private nodoSimple siguiente;

    public nodoSimple(libros libros) {
        this.libros = libros;
        this.siguiente = null;
    }

    public libros getLibro() {
        return libros;
    }

    public void setLibro(libros libros) {
        this.libros = libros;
    }

    public nodoSimple getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodoSimple siguiente) {
        this.siguiente = siguiente;
    }
}
