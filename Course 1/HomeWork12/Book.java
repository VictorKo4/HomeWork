package HomeWork12;

public class Book {
    private String bookName;
    private Author fullName;
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
}
