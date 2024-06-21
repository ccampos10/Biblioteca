package autores;

public class NodoListaDoble {
    int dato;
    NodoListaDoble siguiente;
    NodoListaDoble anterior;


    public NodoListaDoble(int dato){
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
        }
    
    public int getDato(){
        return dato;
        }
    public void setDato(int dato){
        this.dato = dato;
        }
    public NodoListaDoble getSiguiente(){
        return siguiente;
        }
    public void setSiguiente(NodoListaDoble siguiente){
        this.siguiente = siguiente;
        }
    public NodoListaDoble getAnterior(){
        return anterior;
        }
    public void setAnterior(NodoListaDoble anterior){
        this.anterior = anterior;
    }

}
