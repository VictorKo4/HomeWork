package homeWork9.task2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        Map<String, Integer> num = new LinkedHashMap<>();
        num.put("Один", 1);
        num.put("Два", 2);
        num.put("Три", 3);
        num.put("Четыре", 4);
        num.put("Пять", 5);
        num.put("Шесть", 6);
        num.put("Семь", 7);
        num.put("Восемь", 8);
        num.put("Девять", 9);
        num.put("Десять", 10);
        for (Map.Entry<String, Integer> strInt : num.entrySet()) {
            System.out.println(strInt.getKey() + " - " + strInt.getValue());
        }
    }
}
