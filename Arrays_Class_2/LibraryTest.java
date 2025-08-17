import java.util.Scanner;

public class LibraryTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        //creando la libreria
        Library library = new Library(5);

        // alimentando el inventario
        library.addBook(new Book("1984", "Orwell", "123", true));
        library.addBook(new Book("Don Quijote de la Mancha", "Cervantes", "456", true));
        library.addBook(new Book("Cien años de soledad", "Gabriel García Márquez", "789", false));
        library.addBook(new Book("El Principito", "Antoine de Saint-Exupéry", "101", true));
        library.addBook(new Book("La sombra del viento", "Carlos Ruiz Zafón", "202", false));

        // mostrando cada libro
        library.displayAllBooks();

        // buscar libro por titulo
        System.out.println("busqueda de libros");
        System.out.println("Ingresa el nombre del libro");

        

        // evaluo que la entrada sea correcta
        String titulo = scanner.nextLine();
        if (titulo == null || titulo.trim().isEmpty()){
            System.out.println("Debes ingresar un nombre");
        }
        Book busqueda = library.busquedaLibros(titulo);
        
        if (busqueda == null){
            System.out.println("el libro buscado no ha sido encontrado");
        } else{
            System.out.println("Resultado encontrado = " + busqueda);
        }

        // eliminar libros
        System.out.println("Digita el isbn del libro que desea eliminar");
        String titulo2 = scanner.nextLine();
        if (titulo2 == null || titulo2.trim().isEmpty()){
            System.out.println("Debes ingresar un nombre");
        }else {
            library.removeBook(titulo2);
        }
        library.displayAllBooks();

        scanner.close();






    }
}
