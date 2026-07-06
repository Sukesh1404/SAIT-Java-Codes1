import java.util.*;

class Emp2 {
    private int id;
    private String name;
    private int marks;

    Emp2(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getMarks() { return marks; }

    @Override
    public String toString() {
        return id + " " + name + " " + marks;
    }
}

public class ComparatorEx2 {
    public static void main(String[] args) {
        ArrayList<Emp2> list = new ArrayList<>();
        list.add(new Emp2(10, "Sukesh", 90));
        list.add(new Emp2(4, "Aman", 85));
        list.add(new Emp2(5, "Ravi", 95));
        list.add(new Emp2(2, "Karan", 88));

        System.out.println("Original: " + list);

        // Sort by Name (Lambda)
        Collections.sort(list, (e1, e2) -> e1.getName().compareTo(e2.getName()));
        System.out.println("Sorted by Name: " + list);

        // Sort by Marks (Descending, Lambda)
        Collections.sort(list, (e1, e2) -> e2.getMarks() - e1.getMarks());
        System.out.println("Sorted by Marks: " + list);

        // Sort by ID (Lambda)
        Collections.sort(list, (e1, e2) -> e1.getId() - e2.getId());
        System.out.println("Sorted by ID: " + list);
    }
}
