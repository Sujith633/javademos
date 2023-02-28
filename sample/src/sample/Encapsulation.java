package sample;

public class Encapsulation {
	public static void main(String[] args) {
		car c = new car();
		c.getcolor();
	}

}
class car{
	public String color;
	public int noofwheels;
	
	public car() {
		color = "red";
		noofwheels=4;
	}
	public String getcolor() {
		return color;
	}
	public int getnoofwheels() {
		return noofwheels;
		
	}
}