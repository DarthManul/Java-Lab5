package transport;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.Comparator;




public class Vehicle {

    private Long id = Long.valueOf(0);//Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
	private String name; //Поле не может быть null, Строка не может быть пустой
	private Coordinates coordinates; //Поле не может быть null
	private java.time.LocalDate creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
	private double enginePower; //Значение поля должно быть больше 0
	private VehicleType type; //Поле может быть null
	private FuelType fuelType; //Поле не может быть null
    public Vehicle() {
    }
    
    public Vehicle(Long id, String name, LocalDate creationDate, Coordinates coordinates, double enginePower, VehicleType type, FuelType fuelType) {
    		this.id = id;
    		this.name = name;
    		this.creationDate = creationDate;
    		this.coordinates = coordinates;
    		this.enginePower = enginePower;
    		this.type = type;
    		this.fuelType = fuelType;
    }
    public static Vehicle enterNewVehicle() {
    	Vehicle vehicle = new Vehicle();
    	Scanner parser = new Scanner(System.in);
    	vehicle.id = Long.valueOf(vehicle.hashCode());
    	System.out.println("Введите название ТС");
    	vehicle.name = parser.nextLine();
    	vehicle.creationDate = LocalDate.now();
    	vehicle.coordinates = Coordinates.enterCoordinates();
    	System.out.println("Введите мощность двигателя (л.с)");
    	vehicle.enginePower = parser.nextDouble();
    	vehicle.type = VehicleType.enterEnum();
    	vehicle.fuelType = FuelType.enterEnum();
    	System.out.println("Транспортное средство успешно добавлено!");
    	return vehicle;
    }
    public String toString() {
    	return id+" "+name+ " "+ coordinates+ " "+creationDate +" "+ enginePower +" "+ type+" "+fuelType;
    }
    public Long getID() {
    	return this.id;
    	}
    public String getName() {
    	return this.name;
    }
    public Coordinates getCoordinates() {
    	return this.coordinates;
    }
    public LocalDate getCreationDate() {
    	return this.creationDate;
    }
    public double getEnginePower() {
    	return this.enginePower;
    }
    public VehicleType getType() {
    	return this.type;
    }
    public FuelType getFuelType() {
    	return this.fuelType;
    }
    public void setID(long id) {
    	this.id = id;
    	}
    public void setName(String name) {
    	this.name = name;
    }
    public void setCoordinates(Coordinates coords) {
    	this.coordinates = coords;
    }
    public void setCreationDate(LocalDate date) {
    	this.creationDate = date;
    }
    public void setEnginePower(double power) {
    	this.enginePower = power;
    }
    public void setType(VehicleType type) {
    	this.type = type;
    }
    public void setFuelType(FuelType type) {
    	this.fuelType = type;
    }
    
    public int compareTo(Vehicle v) {
    	if ((this.enginePower - v.enginePower) <0) return -1;
    	if ((this.enginePower - v.enginePower) >0) return 1;
    	return 0;
    }

    
}


