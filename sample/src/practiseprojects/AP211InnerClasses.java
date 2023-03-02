package practiseprojects;
public class AP211InnerClasses {
	public static void main(String[] args) {
		Device.power();
		Device.Mobile m = new Device.Mobile();
		m.poweeroff();
		Device d = new Device();
		Device.Laptop l = d.new Laptop();
		l.Charge();
	}

}
class Device{
	static void power() {
		System.out.println("Power on....");
	}
	static class Mobile{
		void poweeroff() {
			System.out.println("Power off....");
		}
	}
	class Laptop{
		void Charge() {
			System.out.println("Charging....");
		}
	}

}
