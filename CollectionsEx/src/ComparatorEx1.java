import java.util.*;

class Emp1 {
    private int id;
    private String name;
    private int marks;

    Emp1(int id, String name, int marks) {
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

// Comparator to sort by Name
class NameComparator implements Comparator<Emp1> {
    public int compare(Emp1 e1, Emp1 e2) {
        return e1.getName().compareTo(e2.getName());
    }
}

// Comparator to sort by Marks
class MarksComparator implements Comparator<Emp1> {
    public int compare(Emp1 e1, Emp1 e2) {
        return e2.getMarks() - e1.getMarks();  // Descending order
    }
}

// Comparator to sort by ID
class IdComparator implements Comparator<Emp1> {
    public int compare(Emp1 e1, Emp1 e2) {
        return e1.getId() - e2.getId();
    }
}

public class ComparatorEx1 {
    public static void main(String[] args) {
        ArrayList<Emp1> list = new ArrayList<>();
        list.add(new Emp1(10, "Sukesh", 90));
        list.add(new Emp1(4, "Aman", 85));
        list.add(new Emp1(5, "Ravi", 95));
        list.add(new Emp1(2, "Karan", 88));

        System.out.println("Original: " + list);

        // Sort by Name
        Collections.sort(list, new NameComparator());
        System.out.println("Sorted by Name: " + list);

        // Sort by Marks
        Collections.sort(list, new MarksComparator());
        System.out.println("Sorted by Marks: " + list);

        // Sort by ID
        Collections.sort(list, new IdComparator());
        System.out.println("Sorted by ID: " + list);
    }
}
