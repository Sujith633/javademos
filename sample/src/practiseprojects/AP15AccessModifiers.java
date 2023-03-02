package practiseprojects;

public class AP15AccessModifiers {
	public static void main(String[] args) {
		Access a = new Access();
		a.didplay();
	}
	
}
class Access{
	void didplay() {
		System.out.println("Default Access Specifier");
	}
}
