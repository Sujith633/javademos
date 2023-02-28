package sample;

public class Polymorphism {
	public static void main(String[] args) {
		Poly py = new Poly();
		py.sum(20,30);
		py.sum("Suj","ith");
		py.sum(233, 78);
	}

}
class Poly{
	void sum(int a,int b) {
		int result = a+b;
		System.out.println("Addition of integers = "+result);
	}
	void sum(float a,float b) {
		float result = a+b;
		System.out.println("Addition of floating point intefers = "+result);
	}
	void sum(long a,int b) {
		long result = a+b;
		System.out.println("Addition of long integers = "+result);
	}
	void sum(String a,String b) {
		String result = a+b;
		System.out.println("Addition of Strings = "+result);
	}
}