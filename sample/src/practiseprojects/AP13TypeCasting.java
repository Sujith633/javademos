package practiseprojects;

public class AP13TypeCasting {
	public static void main(String[] args) {
		System.out.println("Implicit Type Casting");
		char c ='A';
		System.out.println("c = "+ c);
		int a = c;
		System.out.println("Converting character to integer a = "+ a);
		float b = c;
		System.out.println("Converting character to float b = "+ b);
		double d = c;
		System.out.println("Converting character to double d = "+ d);
		long l = c;
		System.out.println("Converting character to long l = "+ l);
		System.out.println("--------------------------------");
		System.out.println("Explict Casting");
		double x= 45.09;
		int y = (int)x;
		System.out.println("Converting double to integer y = "+ y);
		float f=(float)x;
		System.out.println("Converting double to float f = "+ f);
		
	}

}
