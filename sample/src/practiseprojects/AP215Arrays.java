package practiseprojects;

import java.util.Random;

public class AP215Arrays {
	public static void main(String[] args) {
		ArrayDemo ar = new ArrayDemo();
		ar.add();
	}
}
class ArrayDemo{
	
	void add() {
		int[] arr = null;
		Random rm = new Random();
		for(int i =0;i<5;i++) {
			arr[i]=rm.nextInt(1,5);
		}
		for(int i =0;i<5;i++) {
		System.out.println(arr[i]);
	   }
	}
}