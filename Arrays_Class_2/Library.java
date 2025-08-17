public class Library {
    private Book[] books;
    private int bookCount; // que libro nececitamos

    public Library(int capacity) {
        books = new Book[capacity];
        bookCount = 0; // Inicialmente no hay libros
    }

    //methods

    public Book busquedaLibros(String title){
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i]; // Retorna el libro si se encuentra
            }
        }
        return null; // Retorna null si no se encuentra el libro
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("No se pueden agregar más libros, la biblioteca está llena.");
        }
    }

    public void removeBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                // Desplazar los libros restantes hacia la izquierda
                for (int j = i; j < bookCount - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[bookCount - 1] = null; // Eliminar la referencia al último libro
                bookCount--;
                return;
            }
        }
        System.out.println("Libro no encontrado.");
    }

    public void displayAllBooks (){
        System.out.println("La biblioteca tiene: " + bookCount + " y una Capacidad de \n" + books.length + " libros");
        System.out.println("");
        System.out.println("**** Inventario actual ****");
        if (bookCount == 0){
            System.out.println("Biblioteca Vacia");
        } else {
            for (int i = 0; i < bookCount; i++){
                System.out.println(books[i]);
            }
        }
    }

}

