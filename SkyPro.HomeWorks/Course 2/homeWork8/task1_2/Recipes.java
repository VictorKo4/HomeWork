package homeWork8.task1_2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipes extends Product {

    private String name;

    private Product[] product;

    private double totalPrice;

    public Recipes(String name, Product... product) {
        this.name = name;
        this.product = product;
    }

    public Recipes(){}

    public static Set<Recipes> recipes = new HashSet<>();

    public void add(Recipes recipe) {
        if (recipes.contains(recipe)) {
            throw new IllegalArgumentException("Такой рецепт уже есть!");
        } else {
            recipes.add(recipe);
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
        return totalPrice;
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
