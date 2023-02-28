package sample;

public interface I1 {
	default void poweron() {
		System.out.println("Power on monitor...");
	}

}
