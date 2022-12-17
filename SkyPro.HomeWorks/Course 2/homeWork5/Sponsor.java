package homeWork5;

public class Sponsor {
    private final String name;
    private final int amount;

    public Sponsor(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

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
    public String toString() {
        return name;
    }
}
