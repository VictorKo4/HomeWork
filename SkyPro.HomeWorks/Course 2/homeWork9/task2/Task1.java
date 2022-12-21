package homeWork9.task2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Task1 {

    public static Integer sum(List<Integer> list) {
        Integer s = 0;
        for (Integer i : list) {
            s += i;
        }
        return s;
    }
    public static void main(String[] args) {
        Map<String, List<Integer>> listMap = new HashMap<>();
        listMap.put("str1", List.of(1,5,10));
        listMap.put("str2", List.of(100,150,200));
        listMap.put("str3", List.of(210,350,450));
        listMap.put("str4", List.of(500,650,800));
        listMap.put("str5", List.of(850,900,990));

        Map<String, Integer> listMap1 = new HashMap<>();
        for (Map.Entry<String, List<Integer>> strList : listMap.entrySet()) {
            listMap1.put(strList.getKey(), sum(strList.getValue()));
        }
        for (Map.Entry<String, Integer> strInt : listMap1.entrySet()) {
            System.out.println(strInt.getKey() + " - " + strInt.getValue());
        }
    }
}

