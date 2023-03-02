package practiseprojects;

import java.util.HashMap;
import java.util.Map;

public class AP29Map {
	public static void main(String[] args) {
		Map<String,Integer> m = new HashMap<>();
		m.put("jon", 0);
		m.put("jon1", 10);
		m.put("jon2", 20);
		m.put("jon3", 30);
		m.put("jon4", 40);
		System.out.println(m);
		System.out.println(m.values());
		System.out.println(m.keySet());
	}
}
