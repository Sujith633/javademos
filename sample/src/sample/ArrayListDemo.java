package sample;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> arr =  new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(34);
		arr.add(56);
		arr.add(89);
		System.out.println(arr);
		arr.add(2,4);
		System.out.println(arr);
		arr.set(3,101);
		System.out.println(arr);
		arr.remove(2);
		System.out.println(arr);
		if(arr.contains(20)){
			System.out.println("found");
		}
		else {
			System.out.println("not found");
		}
	}

}
