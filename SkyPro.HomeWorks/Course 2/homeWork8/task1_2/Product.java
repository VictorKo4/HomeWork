package homeWork8.task1_2;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Product {

    private String name;
    private double price;
    private int weight;

    public Product(String name, int weight, double price) {
        setName(name);
        setWeight(weight);
        setPrice(price);
    }

    public Product(){}

    public static Set<Product> products = new HashSet<>();

    public void add(Product product) {
        if (products.contains(product)) {
            throw new IllegalArgumentException("Такой продукт уже есть!");
        } else {
            products.add(product);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            throw new IllegalArgumentException("Заполните карточку товара полностью!");
        }
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью!");
        }
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью!");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return '\n' + "Продукт - " + name +
                ". Вес: " + weight + "кг" +
                ". Цена: " + price + "руб.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
