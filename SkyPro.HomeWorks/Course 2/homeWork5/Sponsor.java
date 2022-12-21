package homeWork5;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Sponsor {
    private final String name;
    private final int amount;

    public Sponsor(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public static Set<Sponsor> sponsors = new HashSet<>();

    public void sponsorRace() {
        System.out.println("Спонсор " + '\"' + name + '\"' + " проспонсировал заезд на " + amount + " спосорских денег");
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return name.equals(sponsor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
