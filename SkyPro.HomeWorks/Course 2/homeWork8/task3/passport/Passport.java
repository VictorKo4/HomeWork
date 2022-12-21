package homeWork8.task3.passport;

import java.time.LocalDate;
import java.util.Objects;

public class Passport {
    private String number;
    private String name;
    private String surname;
    private String middleName;
    private LocalDate birthday;

    public Passport(String number, String name, String surname, String middleName, LocalDate birthday) {
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.birthday = birthday;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", middleName='" + middleName + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return number.equals(passport.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
