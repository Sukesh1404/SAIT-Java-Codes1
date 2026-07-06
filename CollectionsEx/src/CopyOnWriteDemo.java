import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        for (String s : list) {
            System.out.println(s);
            // Even modifying inside loop won’t cause ConcurrentModificationException
            list.add("X");
        }

        System.out.println("Final List: " + list);
    }
}
