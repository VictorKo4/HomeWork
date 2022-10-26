package homeWork12;

import java.util.Objects;

public class Book {
    private final String bookName;
    private final Author fullName;
    private int yearPublishing;
    public Book(String bookName, int yearPublishing, Author fullName) {
        this.bookName = bookName;
        this.yearPublishing = yearPublishing;
        this.fullName = fullName;
    }
    public String getBookName() {
        return this.bookName;
    }
    public int getYearPublishing() {
        return this.yearPublishing;
    }
    public String getAuthorName() {
        return this.fullName.getFullName();
    }
    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }
    public String toString() {
        return "Книга - " + bookName + '\n' +
                "Год публикации - " + yearPublishing + '\n' +
                "Автор - " + fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublishing == book.yearPublishing && bookName.equals(book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, yearPublishing);
    }
}
