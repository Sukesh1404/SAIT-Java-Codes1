import java.util.*;


class A{
	String name="Sukesh";
	int age=23;
//	int salary=100000000;
	public String toString() {
		return name+" "+age;
	}
}
public class CollectionsEx1 {

	public static void main(String[] args) {
		HashSet a=new HashSet();
//		ArrayList a=new ArrayList();
		System.out.println(a);
		a.add("ram");
		a.add(3.2);
		a.add(3.2);
		a.add(10);
		a.add(new A());
		System.out.println(a);
//		System.out.println(a.get(0));
		for(Object o:a) {
			System.out.println(o);
		}
	}

}
