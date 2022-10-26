package homeWork12;

public class App {

    public static void main(String[] args) {
        Author author = new Author("Dostoevsky", "Fyodor");
        Book book = new Book("Idiot", 1869, author);
        System.out.println("Книга - " + book.getBookName());
        System.out.println("Год публикации - " + book.getYearPublishing());
        System.out.println("Автор - " + author);


        author = new Author("King", "Steven");
        book = new Book("It", 1986, author);
        System.out.println();
        System.out.println(book);
    }
}
