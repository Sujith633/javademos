package practiseprojects;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class AP27Collections {
	public static void main(String[] args) {
		Collect c = new Collect();
		c.add();
	}

}
class Collect{
	List<Integer> lis = new ArrayList<>();
	void add() {
		lis.add(26);
		lis.add(2);
		lis.add(4);
		lis.add(5);
		lis.add(8);
		System.out.println(lis);
		Set s = new TreeSet<>(lis);
		System.out.println(s);
		Random rm = new Random();
		for(int i=1;i<5;i++) {
			lis.add(rm.nextInt(1,5));
		}
		System.out.println(lis);
		Set s1 = new TreeSet<>(lis);
		System.out.println(s1);
	}
	
}
