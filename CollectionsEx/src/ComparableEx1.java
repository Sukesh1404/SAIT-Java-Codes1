import java.util.*;

class Emp implements Comparable<Emp>{
	private int id;
	private String name;
	private int marks;
	
	Emp(int id,String name,int marks){
		this.id=id;
		this.name=name;
		this.marks=marks;		
	}

	@Override
	public String toString() {
		return id+" "+name+" "+marks;
	}
	
	public int compareTo(Emp o) {
//		return this.id-o.id;
		return o.id-this.id;
	}
}
public class ComparableEx1 {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(34);
		a.add(22);
		a.add(6);
		a.add(12);
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		
		ArrayList b=new ArrayList();
		b.add(new Emp(10,"Sukesh",90));
		b.add(new Emp(04,"Universal",80));
		b.add(new Emp(05,"Pandey",70));
		System.out.println(b);
		Collections.sort(b);
		System.out.println(b);
	}
}
