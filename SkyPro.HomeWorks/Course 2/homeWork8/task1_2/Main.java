package homeWork8.task1_2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import static homeWork8.task1_2.Product.products;
import static homeWork8.task1_2.Recipes.recipes;

public class Main {

    public static void main(String[] args) {
        //task 1.1
        products.add(new Product("Бананы", 2, 67.90));
        products.add(new Product("Яблоки", 1, 99.90));
        products.add(new Product("Апельсины", 1,80));
        System.out.println(products);
        //Product product = new Product();
        //product.add(new Product("Апельсины", 1,80));
        //System.out.println(product);
        System.out.println();

        //task 2.1
        Product bananas = new Product("Бананы", 2, 67.90);
        Product orange = new Product("Апельсины", 1,80);
        Product apples = new Product("Яблоки", 1, 99.90);
        recipes.add(new Recipes("Фрутелла", bananas, orange, apples));
        System.out.println(recipes);
        //Recipes recipe = new Recipes();
        //recipe.add(new Recipes("Фрутелла", 12, bananas, orange, apples));
        //System.out.println(recipe);
        System.out.println();

        //task 2.2
        Random random = new Random();
        Set<Integer> num = new HashSet<>();
        while (num.size() < 20) {
            num.add(random.nextInt(1000));
        }
        
        Iterator<Integer> iterator = num.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 == 1) {
                iterator.remove();
            }
        }
        System.out.println(num);
    }
}
