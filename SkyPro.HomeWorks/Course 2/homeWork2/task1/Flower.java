package homeWork2.task1;

public class Flower {
    private String flowerColor;
     String country;
    String flowerName;
    double cost;
    int lifeSpan;

    public String getFlowerColor(String flowerColor) {
        if (flowerColor != null && !flowerColor.isEmpty() && !flowerColor.isBlank()) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "Белый";
        }
        return this.flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
            this.flowerColor = flowerColor;
    }

    public String getCountry(String country) {
        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {
            this.country = "Россия";
        }
        return this.country;
    }

    public void setCountry(String country) {
            this.country = country;
    }

    public double getCost(double cost) {
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
        return this.cost;
    }

    public void setCost(double cost) {
            this.cost = cost;
    }

    public int getlifeSpan(int lifeSpan) {
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
        return this.lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public Flower(String flowerName, String flowerColor, String country, double cost, int lifeSpan) {
        this.flowerName = flowerName;
        this.flowerColor = flowerColor;
        this.country = country;
        this.cost = cost;
        this.lifeSpan = lifeSpan;
    }

    public static void flowers() {
        Flower[] flower = new Flower[10];
        flower[0] = new Flower("Роза обыкновенная", "", "Голандия", 35.59, 0);
        flower[1] = new Flower("Хризантема", "Желтый", "", 15, 5);
        flower[2] = new Flower("Пион", "Красный", "", 69.9, 1);
        flower[3] = new Flower("Гипсофила", "", "Турция", 19.5, 10);
        for (Flower list : flower) {
            if (list != null) {
                System.out.println(list);
            }
        }
    }

    @Override
    public String toString() {
        return '\n' + "Цветок: " + flowerName + '\n' +
                "Цвет: " + getFlowerColor(flowerColor) + '\n' + "Страна происхождения: " + getCountry(country) + '\n' +
                "Стоимость: " + getCost(cost) + '\n' + "Срок стояния: " + getlifeSpan(lifeSpan);
    }
}
