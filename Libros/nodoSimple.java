package Libros;

public class nodoSimple {
    String titulo;
    String categoria;
    String autor;
    private nodoSimple siguiente;

    public nodoSimple(String titulo, String categoria, String autor) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.autor = autor;
        this.siguiente = null;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getCategoria() {
        return categoria;
    }
    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public nodoSimple getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodoSimple siguiente) {
        this.siguiente = siguiente;
    }
}
