package sample;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Demo();
	}
	private static void Demo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		int sum =0;
		while(sc.hasNextInt()) {
			a = sc.nextInt();
			sum +=a;
			System.out.println("Enter a number: ");
		}
		System.out.println("The sum is: "+ sum);
	}

}
