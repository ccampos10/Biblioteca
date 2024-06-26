import java.util.*;
import Autores.Autores;
import Categorias.*;
import Libros.Libros;
import Prestamos.Prestamos;

public class Menu {
    static Categorias categorias = new Categorias();
    static Autores autores = new Autores();
    static Libros libros = new Libros(categorias, autores);
    public static void main(String[] args){
        Prestamos.setLibros(libros);
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do{System.out.println("-------Menu--------");
           System.out.println("1. Acceso a Categorias");
           System.out.println("2. Acceso a Autores");
           System.out.println("3. Acceso a Libros");
           System.out.println("4. Acceso a prestamos");
           System.out.println("5. Terminar porgrama");
           opcion = scanner.nextInt();


           switch (opcion){
            case 1:
            menuCategorias(scanner);
            break;
            
            case 2:
            menuAutores(scanner);
            break;

            case 3:
            menuLibros(scanner);
            break;

            case 4:
            menuPrestamos(scanner);
            break;

            case 5:
            System.out.println("programa finalizado....");
            break;
           }


        }while (opcion !=5);
        scanner.close();
    }

    private static void menuCategorias(Scanner scanner){
        int opcion;
        do{
            System.out.println("Menu categorias" );
            System.out.println("1. Crear categorias ");
            System.out.println("2. Editar categorias ");
            System.out.println("3. Eliminar categorias ");
            System.out.println("4. mostrar categorias ");
            System.out.println("5. Regresar al menu principal ");
            System.out.println("Seleccione una de las opciones ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre de la nueva categoria que quiere crear ");
                    String nombreCategoria = scanner.nextLine();
                    categorias.anadirCategoria(nombreCategoria);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre de la categoria que deseas editar ");
                    String nombreCategoriaEditar= scanner.nextLine();
                    System.out.print("Ingrese el nuevo nombre de la categoria ");
                    String nuevoNombre= scanner.nextLine();
                    categorias.cambiarNombre(nuevoNombre, nombreCategoriaEditar);
                    break;
                case 3:
                    System.out.print("Ingrese el nombre de la categoria a eliminar ");
                    nombreCategoria = scanner.nextLine();
                    categorias.eliminarCategoria(nombreCategoria, libros);
                    break;
                case 4:
                    categorias.mostrarCategorias();
                    break;
                case 5:
                    System.out.println("Regresando al menu principal ");
                    break;
                default:
                    System.out.println("Opcion invalida. ingrese denuevo ");
            }
        }while (opcion !=5);
    }

    private static void menuAutores(Scanner scanner){
        int opcion2;
        do {
            System.out.println("Bienvenido al menu Autor");
            System.out.println("1. Crear autor");
            System.out.println("2. Editar autor");
            System.out.println("3. Eliminar autor");
            System.out.println("4. Mostrar lista completa de autores");
            System.out.println("5. Salir del menu");
            opcion2 = scanner.nextInt();
            scanner.nextLine();

            switch (opcion2) {
                case 1:
                    System.out.println("Ingrese el nombre del autor:");
                    String nombreAutor = scanner.nextLine();
                    autores.CrearAutor(nombreAutor);
                    System.out.println("Autor creado exitosamente.");
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del autor que desea editar:");
                    String nombreEditar = scanner.nextLine();
                    System.out.println("Ingrese el nuevo nombre del autor:");
                    String nuevoNombre = scanner.nextLine();
                    autores.EditarAutor(nombreEditar, nuevoNombre);
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del autor a eliminar: ");
                    String nombreEliminar = scanner.next();
                    autores.EliminarAutor(nombreEliminar, libros);
                    break;
                case 4:
                    autores.MostrarListaAutores();
                    break;
                case 5:
                    System.out.println("Saliendo del menu autor");
                default:
                    System.out.println("Error. Ingrese una opcion valida");
            }
        } while (opcion2 != 5);
    }

    private static void menuLibros(Scanner scanner) {
        int opcion;
        do {
            System.out.println("Menu Libros:");
            System.out.println("1. Crear Libro");
            System.out.println("2. Editar Libro");
            System.out.println("3. Eliminar Libro");
            System.out.println("4. Mostrar Libros");
            System.out.println("5. Regresar al Menú Principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el título del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese el nombre de la categoría: ");
                    String categoria = scanner.nextLine();
                    System.out.print("Ingrese el nombre del autor: ");
                    String autor = scanner.nextLine();
                    libros.crearLibro(titulo, categoria, autor);
                    break;
                case 2:
                    System.out.print("Ingrese el título del libro a editar: ");
                    String tituloLibroEditar = scanner.nextLine();
                    System.out.println("Seleccione lo que desea editar:");
                    System.out.println("1. Título");
                    System.out.println("2. Autor");
                    System.out.println("3. Categoría");
                    System.out.print("Seleccione una opción: ");
                    int opcionEditar = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer
                    String nuevoTitulo = null;
                    String nuevoAutor = null;
                    String nuevaCategoria = null;
                    switch (opcionEditar) {
                        case 1:
                            System.out.print("Ingrese el nuevo título: ");
                            nuevoTitulo = scanner.nextLine();
                            break;
                        case 2:
                            System.out.print("Ingrese el nuevo nombre del autor: ");
                            nuevoAutor = scanner.nextLine();
                            // nuevoTitulo = tituloLibroEditar; // Retain original title
                            // nuevaCategoria = categorias.buscarCategoriaPorTitulo(tituloLibroEditar).getNombre();
                            break;
                        case 3:
                            System.out.print("Ingrese el nuevo nombre de la categoría: ");
                            nuevaCategoria = scanner.nextLine();
                            // nuevoTitulo = tituloLibroEditar; // Retain original title
                            // nuevoAutor = autores.buscarAutorPorTitulo(tituloLibroEditar).getNombre();
                            break;
                        default:
                            System.out.println("Opción no válida. Intente nuevamente.");
                            continue;
                    }
                    libros.editarLibro(tituloLibroEditar, nuevoTitulo, nuevaCategoria, nuevoAutor);
                    break;
                case 3:
                    System.out.print("Ingrese el título del libro a eliminar: ");
                    titulo = scanner.nextLine();
                    libros.eliminarLibro(titulo);
                    break;
                case 4:
                    libros.mostrarListaLibros();
                    break;
                case 5:
                    System.out.println("Regresando al Menú Principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 5);
    }

    private static void menuPrestamos(Scanner scanner){
        int opcion;
        do{
            System.out.println("\nMenú de prestamos");
            System.out.println("1. Mostrar libros prestados");
            System.out.println("2. Mostrar libros disponibles");
            System.out.println("3. Prestar un libro");
            System.out.println("4. Devolver un libro");
            System.out.println("5. Regresar al menu principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Libros prestados:");
                    Prestamos.mostrarPrestamos();
                    break;
                case 2:
                    System.out.println("Libros disponibles:");
                    Prestamos.mostrarLibrosDisponibles();
                    break;
                case 3:
                    System.out.println("Título del libro a prestar: ");
                    String tituloPrestar = scanner.nextLine();
                    Prestamos.prestarLibro(tituloPrestar);
                    break;
                case 4:
                    System.out.print("Título del libro a devolver: ");
                    String tituloDevolver = scanner.nextLine();
                    Prestamos.devolverLibro(tituloDevolver);
                    break;
                case 5:
                    System.out.println("Regresando al Menú Principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }while(opcion != 5);
    }
}