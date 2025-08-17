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
        System.out.println("Ingresa el nombre del libro");
        Book busqueda : library.busquedaLibros()

    }
}
