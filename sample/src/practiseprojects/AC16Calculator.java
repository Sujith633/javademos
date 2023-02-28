package practiseprojects;

import java.util.Scanner;

public class AC16Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int a= sc.nextInt();
		int b = sc.nextInt();
		int result;
		System.out.println("Enter your choice:");
		System.out.println("1 - ADDITION ");
		System.out.println("2 - SUBTRACTION ");
		System.out.println("3 - PRODUCT ");
		System.out.println("4 - DIVISION ");
		int ch = sc.nextInt();
		switch(ch) {
		case 1:
			result=a+b;
			System.out.println("The sum of two numbers is = "+ result);
			break;
		case 2:
			result=a-b;
			System.out.println("The difference of two numbers is = "+ result);
			break;
		case 3:
			result=a*b;
			System.out.println("The product of two numbers is = "+ result);
			break;
		case 4:
			result=a/b;
			System.out.println("The remainder is = "+ result);
			break;
		default:
			System.out.println("Enter the correct choice ");
				
		}
	}

}
