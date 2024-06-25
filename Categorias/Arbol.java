package Categorias;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Arbol {
    NodoListaDoble raiz = null;

    public boolean anadirNodo(String nombre){
        NodoListaDoble nuevo = new NodoListaDoble(nombre);
        if (raiz == null) {
            raiz = nuevo;
            return true;
        }
        if (buscarNodo(nombre) != null) return false;
        NodoListaDoble padre= bfs();
        if (padre.getAnterior() == null) padre.setAnterior(nuevo);
        else padre.setSiguiente(nuevo);
        return true;
    }

    public boolean editar(String nombre, String nombreAntiguo){
        NodoListaDoble nodo = buscarNodo(nombreAntiguo);
        if (nodo == null) return false;
        nodo.setDato(nombre);
        return true;
    }

    public boolean eliminar(String nombre){
        if (raiz.getDato().equals(nombre)){
            NodoListaDoble iz = raiz.getAnterior();
            NodoListaDoble dr = raiz.getSiguiente();
            raiz = iz;
            NodoListaDoble padre= bfs();
            if (padre == null) return true;
            if (padre.getAnterior() == null) padre.setAnterior(dr);
            else padre.setSiguiente(dr);
            return true;
        }
        else {
            NodoListaDoble nodoP = buscarNodoPadre(nombre);
            if (nodoP == null) return false; // no existe este nombre
            NodoListaDoble nodo;
            if (nodoP.getAnterior().getDato().equals(nombre)) {
                nodo = nodoP.getAnterior();
                NodoListaDoble iz = nodo.getAnterior();
                NodoListaDoble dr = nodo.getSiguiente();
                nodoP.setAnterior(iz);
                
                NodoListaDoble padre= bfs();
                if (padre.getAnterior() == null) padre.setAnterior(dr);
                else padre.setSiguiente(dr);
            }
            else {
                nodo = nodoP.getSiguiente();
                NodoListaDoble iz = nodo.getAnterior();
                NodoListaDoble dr = nodo.getSiguiente();
                nodoP.setSiguiente(iz);
                
                NodoListaDoble padre= bfs();
                if (padre.getAnterior() == null) padre.setAnterior(dr);
                else padre.setSiguiente(dr);
            }

            return true;
        }
    }

    public void mostrarDatos(){
        if (raiz == null) System.out.println("La lista esta vacia");
        Stack<NodoListaDoble> cola = new Stack<>();
        cola.add(raiz);
        System.out.print("[ ");
        while (!cola.isEmpty()) {
            NodoListaDoble ac = cola.pop();
            NodoListaDoble iz = ac.getAnterior();
            NodoListaDoble dr = ac.getSiguiente();
            System.out.print(""+ac.getDato()+ " ");
            
            if (dr != null) cola.add(dr);
            if (iz != null) cola.add(iz);
        }
        System.out.print("]\n");
    }

    public Boolean existe(String nombre){
        NodoListaDoble nodo = buscarNodo(nombre);
        if (nodo == null) return false;
        else return true;
    }

    private NodoListaDoble bfs(){
        NodoListaDoble menosProfundo = null;
        Queue<NodoListaDoble> cola = new LinkedList<>();
        if (raiz == null) return null;
        cola.add(raiz);
        while (!cola.isEmpty()) {
            NodoListaDoble ac = cola.poll();
            NodoListaDoble iz = ac.getAnterior();
            NodoListaDoble dr = ac.getSiguiente();
            if (iz== null || dr == null) {
                menosProfundo = ac;
                break;
            }
            cola.add(iz);
            cola.add(dr);
        }

        return menosProfundo;
    }

    private NodoListaDoble buscarNodo(String nombre){
        NodoListaDoble aBuscar = null;
        Queue<NodoListaDoble> cola = new LinkedList<>();
        cola.add(raiz);
        while (!cola.isEmpty()) {
            NodoListaDoble ac = cola.poll();
            NodoListaDoble iz = ac.getAnterior();
            NodoListaDoble dr = ac.getSiguiente();
            if (ac.getDato().equals(nombre)) {
                aBuscar = ac;
                break;
            }
            if (iz != null) cola.add(iz);
            if (dr != null) cola.add(dr);
        }

        return aBuscar;
    }
    
    private NodoListaDoble buscarNodoPadre(String nombre){
        NodoListaDoble aBuscar = null;
        Queue<NodoListaDoble> cola = new LinkedList<>();
        cola.add(raiz);
        while (!cola.isEmpty()) {
            NodoListaDoble ac = cola.poll();
            NodoListaDoble iz = ac.getAnterior();
            NodoListaDoble dr = ac.getSiguiente();
            if (iz != null && iz.getDato().equals(nombre)) {
                aBuscar = ac;
                break;
            }
            else if (dr != null && dr.getDato().equals(nombre)) {
                aBuscar = ac;
                break;
            }
            if (iz != null) cola.add(iz);
            if (dr != null) cola.add(dr);
        }

        return aBuscar;
    }
}
