package sample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		Demo();
		HashDemo();
	}
	public static void Demo() {
		Random rm = new Random();
		int x = rm.nextInt(1,100);
		System.out.println(x);
	}
	public static void HashDemo() {
		Random rm = new Random();
		List<Integer> list = new ArrayList<>();
		for(int i= 0;i<10;i++) {
			list.add(rm.nextInt(1,50));
			
		}
		System.out.println(list);
		Set<Integer> sc = new HashSet<>(list);
		System.out.println(sc);
		Set<Integer> sc1 = new LinkedHashSet<>(list);
		System.out.println(sc1);
		Set<Integer> sc2 = new TreeSet<>(list);
		System.out.println(sc2);
	}

}
