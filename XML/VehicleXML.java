package XML;

import org.simpleframework.xml.*;
import Transport.*;
import java.time.LocalDate;



@Root(name="Vehicle")
public class VehicleXML {
	@Element(name="id")
	protected Long id;
	
	@Element(name="name")
	protected String name;
	
	@Element(name="coordinates")
	protected Coordinates coordinates;
	
	@Element(name="creationDate")
	protected String creationDate;
	
	@Element(name="enginePower")
	protected double enginePower;
	
	@Element(name="type")
	protected VehicleType type;
	
	@Element(name="fueltype")
	protected FuelType fuelType;
	
	public VehicleXML(Vehicle vehicle) {
		this.id = vehicle.getID();
		this.name = vehicle.getName();
		this.coordinates = vehicle.getCoordinates();
		this.creationDate = vehicle.getCreationDate().toString();
		this.enginePower = vehicle.getEnginePower();
		this.type = vehicle.getType();
		this.fuelType = vehicle.getFuelType();
	}
}