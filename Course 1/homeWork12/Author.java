package homeWork12;

import java.util.Objects;

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

    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return fullName.equals(author.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName);
    }
}
