package practiseprojects;

public class AP25Constructor {
	public static void main(String[] args) {
		Construct con =new Construct();
		con.Construct("Some");
		Default d = new Default();
		d.pop();
	}
	
}
class Construct{
	void Construct(String str){
		System.out.println("The String is "+ str);
		System.out.println("This is parametericed constructor");
	}
}
class Default{
	void pop() {
		System.out.println("This is default constructor");
	}
}
