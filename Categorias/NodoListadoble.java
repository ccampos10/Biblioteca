package Categorias;

class NodoListaDoble {
    String dato;
    NodoListaDoble siguiente;
    NodoListaDoble anterior;

    public NodoListaDoble(String dato){
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
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

    public void setDato(String dato){
        this.dato = dato;
    }
    public void setSiguiente(NodoListaDoble siguiente){
        this.siguiente = siguiente;
    }
    public void setAnterior(NodoListaDoble anterior){
        this.anterior = anterior;
    }

}
