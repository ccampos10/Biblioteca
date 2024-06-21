class NodoDoble {
    String dato;
    private NodoDoble siguiente;
    private NodoDoble anterior;

    public NodoDoble(String dato){
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }
   
}
