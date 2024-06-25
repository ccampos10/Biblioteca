import java.util.*;
import autores.listaautores;
import Categorias.*;
import libros.ListaLibros;
import Prestamos.PrestamosLibros;



public class Menu {
    

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do{System.out.println("-------Menu--------");
           System.out.println("1. Acceso a Categorios");
           System.out.println("2. Acceso a Autores");
           System.out.println("3. Acceso a Libros");
           System.out.println("4. Acceso a prestamos");
           System.out.println("5. Terminar porgrama");
           opcion = scanner.nextInt();


           switch (opcion){
            case 1:
            Categorias.CategoriaLibros(scanner);
            break;
            
            case 2:
            autores.listaautores(scanner);
            break;

            case 3:
            libros.ListaLibros(scanner);
            break;

            case 4:
            Prestamos.PrestamosLibros(scanner);
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
            opion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre de la nueva categoria que quiere crear ");
                    String nombreCategoria = scanner.nextLine();
                    Categoria nuevaCategoria = new Categoria(nombreCategoria);
                    Categoria.anadirCategoria(nuevaCategoria);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre de la categoria que deseas editar ");
                    String nombreCategoriaEditar= scanner.nextLine();
                    Categoria categoriaAEditar = Categorias.cambiarNombre(nombreCategoriaEditar);
                    break;
                case 3:
                    System.out.print("Ingrese el nombre de la categoria a eliminar ");
                    nombreCategoria= scanner.nextLine();
                    Categoria eliminaCategoria = Categorias.eliminarCategorias(nombreCategoria);
                    break;
                case 4:
                    Categorias.mostrarCAtegorias();
                    break;
                case 5:
                    System.out.println("Regresando al menu principal ");
                    break;
                default:
                    System.out.println("Opcion invalida. ingrese denuevo ");

            }
        }while (oppcion !=5);
    }

    private static void menuAutores(Scanner scanner){
        int opcion;
        do{
            System.out.pirntln("menu Autores:");
            System.out.println("1. Crear Autor");
            System.out.println("2. editar autor ");
            System.out.println("3. eliminar autor ");
            System.out.println("4. mostrar autores ");
            System.out.println("5. Regresar al menu principal");
            System.out.print("Seleccione una de las opciones ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion){
                case 1:
                    System.out.print("Ingrese el nombre del autor ");
                    String nombreAutores = scanner.nextLine();
                    Autor nuevoAutor = new 

                        }
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
                listaLibros.crearLibro(titulo, categoria, autor);
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
                String nuevoTitulo = tituloLibroEditar;
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
                        nuevoTitulo = tituloLibroEditar; // Retain original title
                        nuevaCategoria = categorias.buscarCategoriaPorTitulo(tituloLibroEditar).getNombre();
                        break;
                    case 3:
                        System.out.print("Ingrese el nuevo nombre de la categoría: ");
                        nuevaCategoria = scanner.nextLine();
                        nuevoTitulo = tituloLibroEditar; // Retain original title
                        nuevoAutor = autores.buscarAutorPorTitulo(tituloLibroEditar).getNombre();
                        break;
                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                        continue;
                }
                listaLibros.editarLibro(tituloLibroEditar, nuevoTitulo, nuevaCategoria, nuevoAutor);
                break;
            case 3:
                System.out.print("Ingrese el título del libro a eliminar: ");
                titulo = scanner.nextLine();
                listaLibros.eliminarLibro(titulo);
                break;
            case 4:
                listaLibros.mostrarListaLibros();
                break;
            case 5:
                System.out.println("Regresando al Menú Principal...");
                break;
            default:
                System.out.println("Opción no válida. Intente nuevamente.");
        }
    } while (opcion != 5);
}

                    
                    
            
    
                    
                    
                    
                    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }   
    
