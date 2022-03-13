package Transport;
import java.util.HashMap;
import java.time.LocalDate;

public class VehicleCollection {
	public static HashMap<String, Vehicle> collection = new HashMap<>();
	LocalDate creationDate;
	public VehicleCollection() {
		this.creationDate = LocalDate.now();
	}
	
	public static void add(String key, Vehicle vehicle) {
		collection.put(key, vehicle);
	}
	public static void show() {
		collection.forEach((k,v) -> System.out.println(k + " "+ v));
	}
	
}
