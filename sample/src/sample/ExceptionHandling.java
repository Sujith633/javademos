package sample;
import java.util.*;
import java.io.IOException;
public class ExceptionHandling {
	public static void main(String[] args) {
		int a,b;
		double result;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter two numbers :");
		a = obj.nextInt();
		b = obj.nextInt();
		try {
		result = a/b;
		System.out.println("The result is : "+ result);
		}
		catch(Exception e) {
			System.out.println("Zero Division error"+ e.getMessage());
			e.getStackTrace();
		}
	}

}
