package homeWork9.task1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void task1_1() {
        HashMap<String, String> telephoneDirectory = new HashMap<>();
        telephoneDirectory.put("Иванов Иван", "+79285960385");
        telephoneDirectory.put("Петров Петр", "+79249582057");
        telephoneDirectory.put("Сидоров Николай", "+79217395720");
        telephoneDirectory.put("Иванова Мария", "+79243927593");
        telephoneDirectory.put("Козлов Александр", "+7918058304");
        telephoneDirectory.put("Хоркина Светлана", "+79240596824");
        telephoneDirectory.put("Игнатов Игнат", "+7922059285");
        telephoneDirectory.put("Маркова Анна", "+7921938503");
        telephoneDirectory.put("Степанов Степан", "+79184867309");
        telephoneDirectory.put("Степаненко Юлия", "+79240394475");
        telephoneDirectory.put("Козыренко Василий", "+79205588339");
        telephoneDirectory.put("Понасенко Артем", "+79210012367");
        telephoneDirectory.put("Брысин Альберт", "+79285028573");
        telephoneDirectory.put("Корчинян Ашот", "+79254039572");
        telephoneDirectory.put("Белова Наталья", "+79203958374");
        telephoneDirectory.put("Ноу Нейм", "+79210495827");
        telephoneDirectory.put("Инкогнито Вадим", "+79210055864");
        telephoneDirectory.put("Толстой Лев", "+79284957204");
        telephoneDirectory.put("Пушкин Александр", "+79220495867");
        telephoneDirectory.put("Никрасов Колька", "+79275930294");
        System.out.println(telephoneDirectory.keySet());
    }

    private static final Map<String, Integer> num = new HashMap<>();

    public static void task1_3() {
        num.put("str1", 1);
        num.put("str2", 2);
        num.put("str3", 3);
        //add("str3", 3);
        for (Map.Entry<String, Integer> strInt : num.entrySet()) {
            System.out.println(strInt.getKey() + " - " + strInt.getValue());
        }
    }
    public static void add(String s, Integer i) {
        if(num.containsKey(s) && num.containsValue(i)) {
            throw new IllegalArgumentException("Такой ключ уже есть");
        } else {
            num.put(s, i);
        }
    }
    public static void main(String[] args) {
        task1_1();
        task1_3();
    }
}
