package sample;

public class MethodOveriding {
	public static void main(String[] args) {
		Mac ed = new Macair();
		ed.poweron();
	}
}
class Mac{
	void poweron() {
		System.out.println("Power on...");
	}
}
class Macair extends Mac{
	void poweron() {
		System.out.println("Power TV on...");
	}
}
class Macbook extends Mac{
	void poweron() {
		System.out.println("Power Desktop on...");
	}
}