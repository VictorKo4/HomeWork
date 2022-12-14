package homeWork7;

import java.util.*;

public class Main {

    private static final List<String> NAMES = List.of(
            "Петр", "Василий", "Наталья", "Иван", "Светлана",
            "Александр", "Валентина", "Михаил", "Ирина", "Анжелика"
    );

    private static final Random RANDOM = new Random();

    private static void randomFilling(Queue<String> queue) {
        int size = RANDOM.nextInt(6);
        for (int i = 0; i < size; i++) {
            queue.offer(NAMES.get(RANDOM.nextInt(NAMES.size())));
        }
    }

    private static void add(String name, Queue<String> queue1, Queue<String> queue2) {
        if (queue1.size() == queue2.size()){
            System.out.println("Очередь заполнена, зову Галю");
            return;
        } if (queue1.size() < queue2.size()) {
            queue1.offer(name);
        } else if (queue2.size() < queue1.size()) {
            queue2.offer(name);
        }
    }

    private static final Queue<String> queue1 = new ArrayDeque<>(5);
    private static final Queue<String> queue2 = new ArrayDeque<>(5);

    public static void addPeople(List NAMES) {
        queue1.offer(NAMES.toString());
        queue2.offer(NAMES.toString());
    }

    private static void remove(Queue<String> queue1, Queue<String> queue2) {
        if (RANDOM.nextBoolean()) {
            queue1.poll();
        } else {
            queue2.poll();
        }
    }

    private static void example() {
        List<List<String>> biDemArrList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                biDemArrList.get(i).add(j, ((i + j) % 2 == 1 ? "●" : "◯"));
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(biDemArrList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue<String> queue1 = new ArrayDeque<>(5);
        Queue<String> queue2 = new ArrayDeque<>(5);
        randomFilling(queue1);
        randomFilling(queue2);
        //add("Григорий", queue1, queue2);
        //addPeople(NAMES);
        System.out.println("Первая очередь " + queue1);
        System.out.println("Вторая очередь " + queue2);
        System.out.println();

        example();
    }
}
