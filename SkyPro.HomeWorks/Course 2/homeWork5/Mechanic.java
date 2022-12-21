package homeWork5;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Mechanic<T extends Transport> {

    private final String name;
    private final String surname;
    private final String company;

    public Mechanic(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
    }

    public static Set<Mechanic> mechanics = new HashSet<>();

    public boolean service(T t) {
       return t.diagnostics();
    }

    public void repair(T t) {
        t.repair();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return name.equals(mechanic.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
