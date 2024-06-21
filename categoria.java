public class categoria {
    Arbol arbol = new Arbol();

    public void crearCategoria(String nombre) arbol.crearRama(nombre);
    public void crearSubCategoria(String nombre, nodoDoble cat) arbol.agregarHijo(nombre, cat);
    public void cambiarNombre(String nombre, nodoDoble nodo) arbol.editar(nombre, nodo); // agregar funcion que cambia tambien el nodo padre??
    public void eliminarCategoria(String nombre) arbol.eliminar(nombre);
    public void mostrarCategorias() arbol.mostrarDatos();
}
