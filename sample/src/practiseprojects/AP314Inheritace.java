package practiseprojects;

public class AP314Inheritace {
	public static void main(String[] args) {
		Food fd = new Food();
		fd.petfood();
		fd.breed();
		fd.petname();
	}

}
class Human{
	void petname(){
	String pet = "Dog";
	System.out.println("The pet is "+ pet);
	}
}
class Pet extends Human{
	void breed() {
		String petbreed="pug";
		System.out.println("The petbreed is "+ petbreed);
	}
}
class Food extends Pet{
	void petfood() {
		String food1="biscuits";
		System.out.println("The petfood is "+ food1);
	}
	
}