public class Book {
    // Attributes
    private String title;
    private String author;
    private String isbn; // identificacion unica del libro
    private boolean isAvailable;

    // Constructor
    public Book(String title, String aurhor, String isbn, boolean isAvailable, String author) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true; // Por defecto, el libro está disponible
    }

    // Getters
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getIsbn(){
        return this.isbn;
    }
    public boolean isAvailable(){
        return this.isAvailable;
    }

    // Setters
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;   
    }
    public void setAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }

    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }

}