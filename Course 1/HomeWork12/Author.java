package HomeWork12;

public class Author {
    private String firstName;
    private String lastName;
    private String fullName;
    public Author(String lastName, String firstName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String getFullName() {
        return this.fullName;
    }
}
