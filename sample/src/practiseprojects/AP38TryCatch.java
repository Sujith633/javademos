package practiseprojects;

import java.util.Scanner;

public class AP38TryCatch {
	public static void main(String[] args) {
		String s=null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a =sc.nextInt();
		int b = sc.nextInt();
		try {
			int result = a/b;
			System.out.println("The result is : "+ result);
			System.out.println("The length of string is : "+ s.length());
		}
		catch(NullPointerException e) {
			System.out.println("NullPointer"+ e.getMessage());
		}
		catch(Exception ex) {
			System.out.println("Zero Division"+ ex.getMessage());
		}
	}

}
