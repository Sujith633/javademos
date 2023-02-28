package practiseprojects;

public class AP23Methods {
	public static void main(String[] args) {
		add();
		Area a= new Area();
		int ans=a.area(12, 18);
		System.out.println(ans);
		int ans1=a.area(12, 18,15);
		System.out.println(ans1);
	}
	static void add() {
		int a = 10;
		int b = 20;
		int sum = a+b;
		System.out.println("The sum is :"+ sum);
	}

}
class Area{
	public int area(int a,int b) {
		int result = a*b;
		System.out.println("The area of rectangle is : ");
		return result;
	}
	public int area(int a,int b,int c) {
		int result = a*b*c;
		System.out.println("The volume is : ");
		return result;
	}
}