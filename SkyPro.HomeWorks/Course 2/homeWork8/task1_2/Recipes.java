package homeWork8.task1_2;

import java.util.*;

public class Recipes extends Product {

    private String name;

    private Product[] product;

    private double totalPrice;

    public Recipes(String name, Product... product) {
        this.name = name;
        this.product = product;
    }

    public Recipes(){}

    public static HashMap<Product, Integer> recipes = new HashMap<>();

    public void add(Product product) {
        if (product == null) {
            return;
        } if (products.containsKey(product)){
            Integer prodCount = products.get(product);
            products.put(product, ++prodCount);
        } else {
            products.put(product, 1);
        }
    }

    public String getName() {
        if (name == null || name.isEmpty() || name.isBlank()) {
            throw new IllegalArgumentException("Заполните название рецепта!");
        }
        return name;
    }

    public Product[] getProduct() {
        return product;
    }

    public double getTotalPrice() {
        double sum = 0;
        for (Map.Entry<Product, Integer> product : products.entrySet()) {
            sum += product.getKey().getPrice() * product.getValue();
        }
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipes recipes = (Recipes) o;
        return name.equals(recipes.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return '\n' + "Название рецепта: " + getName() + '\n' +
                "Продукты: " + Arrays.toString(product);
    }
}
