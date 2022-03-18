package XML;

import org.simpleframework.xml.*;
import java.util.HashMap;
import java.time.LocalDate;



@Root(name="VehicleCollection")
public class CollectionXML {
	@Attribute(name="creationDate")
	public String creationDate;
	
	@ElementMap(inline=true, entry="Vehicle", key="key", value="Parameters", data=false)
	public static HashMap<String, VehicleXML> vehicles;
	
	public CollectionXML(LocalDate creationDate) {
		this.creationDate = creationDate.toString();
		this.vehicles = new HashMap<String, VehicleXML>(); 
	}
	
	public void add(String key, VehicleXML vehicle) {
		this.vehicles.put(key, vehicle);
	}
}


