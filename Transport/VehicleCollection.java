package Transport;
import java.util.HashMap;
import java.time.LocalDate;

public class VehicleCollection {
	public static HashMap<String, Vehicle> collection = new HashMap<>();
	public static LocalDate creationDate = LocalDate.now();
	public VehicleCollection() {
	}
	
	public static void add(String key, Vehicle vehicle) {
		collection.put(key, vehicle);
	}
	public static void show() {
		collection.forEach((k,v) -> System.out.println(k + " "+ v));
	}
	public static int numberOfElements() {
		return collection.size();
		
	}
}
