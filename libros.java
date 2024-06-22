public class Libros {
    private nodoSimple cabeza;
    private Categoria categorias;
    private Autor autores;

    public Libros(Categoria categorias, Autor autores) {
        this.categorias = categorias;
        this.autores = autores;
        this.cabeza = null;
    }

    public void crearLibro(String titulo, String categoria, String autor) {
        if (categorias.existeCategoria(categoria) && autores.existeAutor(autor)) {
            nodoSimple nuevoLibro = new nodoSimple("Título: " + titulo + ", Categoría: " + categoria + ", Autor: " + autor);
            if (cabeza == null) {
                cabeza = nuevoLibro;
            } else {
                nodoSimple actual = cabeza;
                while (actual.getSiguiente() != null) {
                    actual = actual.getSiguiente();
                }
                actual.setSiguiente(nuevoLibro);
            }
            System.out.println("Libro creado exitosamente.");
        } else {
            System.out.println("No se puede crear el libro porque la categoría o el autor no existen.");
        }
    }

    public void editarLibro(String titulo, String nuevoTitulo, String nuevaCategoria, String nuevoAutor) {
        if (categorias.existeCategoria(nuevaCategoria) && autores.existeAutor(nuevoAutor)) {
            nodoSimple actual = cabeza;
            boolean encontrado = false;

            while (actual != null) {
                if (actual.getDato().contains("Título: " + titulo + ",")) {
                    actual.setDato("Título: " + nuevoTitulo + ", Categoría: " + nuevaCategoria + ", Autor: " + nuevoAutor);
                    encontrado = true;
                    break;
                }
                actual = actual.getSiguiente();
            }

            if (encontrado) {
                System.out.println("Libro editado exitosamente.");
            } else {
                System.out.println("Libro no encontrado.");
            }
        } else {
            System.out.println("No se puede editar el libro porque la nueva categoría o el nuevo autor no existen.");
        }
    }

    public void eliminarLibro(String titulo) {
        if (cabeza == null) {
            System.out.println("No hay libros en la lista.");
            return;
        }

        if (cabeza.getDato().contains("Título: " + titulo + ",")) {
            cabeza = cabeza.getSiguiente();
            System.out.println("Libro eliminado exitosamente.");
            return;
        }

        nodoSimple actual = cabeza;
        nodoSimple previo = null;
        boolean encontrado = false;

        while (actual != null) {
            if (actual.getDato().contains("Título: " + titulo + ",")) {
                encontrado = true;
                break;
            }
            previo = actual;
            actual = actual.getSiguiente();
        }

        if (encontrado) {
            if (previo != null) {
                previo.setSiguiente(actual.getSiguiente());
            }
            System.out.println("Libro eliminado exitosamente.");
        } else {
            System.out.println("Libro no encontrado.");
        }
    }

    public void mostrarListaLibros() {
        if (cabeza == null) {
            System.out.println("No hay libros en la lista.");
        } else {
            nodoSimple actual = cabeza;
            System.out.println("Lista de Libros:");
            while (actual != null) {
                System.out.println(actual.getDato());
                actual = actual.getSiguiente();
            }
        }
    }
}

