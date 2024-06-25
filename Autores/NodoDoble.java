package Autores;

class NodoDoble {
    String dato;
    NodoDoble siguiente;
    NodoDoble anterior;

    public NodoDoble(String dato){
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }
    
    public String getDato(){
        return dato;
    }
    public NodoDoble getSiguiente(){
        return siguiente;
    }
    public NodoDoble getAnterior(){
        return anterior;
    }

    public void setDato(String dato){
        this.dato = dato;
    }
    public void setSiguiente(NodoDoble siguiente){
        this.siguiente = siguiente;
    }
    public void setAnterior(NodoDoble anterior){
        this.anterior = anterior;
    }

}
