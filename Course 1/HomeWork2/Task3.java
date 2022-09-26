package HomeWork2;

public class Task3 {
    public static void main(String[] args) {
        double dog = 8; // Тип переменной var не присваивается!
        var cat = 3.6;
        var paper = 763789;

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
}
