package sample;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class JavaTreeset {
	public static void main(String[] args) {
		Demoset();
	}
	public static void Demoset() {
		Set<String> str =  new TreeSet<>();
		str.add("Jhon");
		str.add("Zoe");
		str.add("Suijith");
		str.add("Dhana");
		System.out.println(str);
		Set<String> str2 =  new TreeSet<String>(new StringComparator());
		str.add("Jhon");
		str.add("Zoe");
		str.add("Suijith");
		str.add("Dhana");
		System.out.println(str2);
	}

}
class StringComparator implements Comparator<String>{

	@Override
	public int compare(String str, String str2) {
		// TODO Auto-generated method stub
		int l1 = str.length();
		int l2 = str2.length();
		if(l1 < l2) {
			return -1;
		}
		else if(l1 > l2) {
			return 1;
		}
		else {
			return str.compareTo(str2);
		}
		
	}
	
}
