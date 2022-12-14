package homeWork5;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation<T extends Transport> {

    private final Queue<T> queue = new LinkedList<>();

    public void addTransport(T transport) {
        queue.offer(transport);
    }

    public void inspection() {
        T transport = queue.poll();
        if (transport != null) {
            System.out.println("Проводится техобслуживание " + transport);
            inspection();
        }
    }
}
