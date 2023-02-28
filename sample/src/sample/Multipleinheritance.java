package sample;

public class Multipleinheritance {
	public static void main(String[] args) {
		Desktop dk = new Desktop();
		dk.poweron();
	}
}
class ED{
	void poweron() {
		System.out.println("Power on...");
	}
}
class TV extends ED{
	void poweron() {
		System.out.println("Power TV on...");
	}
}
class Desktop extends ED{
	void poweron() {
		System.out.println("Power Desktop on...");
	}
}
class Monitor implements I1,I2{

	@Override
	public void poweron() {
		// TODO Auto-generated method stub
		I1.super.poweron();
		I2.super.poweron();
	}
	
}