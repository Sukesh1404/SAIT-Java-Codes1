import java.util.concurrent.*;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        // Adding elements
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");

        // Reading elements
        System.out.println("Map: " + map);

        // Removing element
        map.remove(2);
        System.out.println("After removal: " + map);

        // Checking if key exists
        System.out.println("Contains key 1? " + map.containsKey(1));
    }
}
