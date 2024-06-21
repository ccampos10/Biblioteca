import java.util.*;
import autores.listaautores;
import Categorias.CategoriaLibros;
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
    
