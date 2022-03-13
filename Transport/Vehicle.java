package Transport;
import java.time.LocalDate;

public class Vehicle {
    private Long id = Long.valueOf(0);//Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDate creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private double enginePower; //Значение поля должно быть больше 0
    private VehicleType type; //Поле может быть null
    private FuelType fuelType; //Поле не может быть null
    public Vehicle() {
    	this.id = Long.valueOf(10);
    	this.name = "Car";
    	this.creationDate = LocalDate.now();
    	this.coordinates = new Coordinates();
    	this.enginePower = 1010;
    	this.type = VehicleType.BOAT;
    	this.fuelType = FuelType.ELECTRICITY;
    }
    public String toString() {
    	return id+" "+name;
    }
}


