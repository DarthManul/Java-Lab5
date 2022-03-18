package Transport;
import java.time.LocalDate;
import java.util.Scanner;

public class Vehicle {
    private Long id = Long.valueOf(0);//Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDate creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private double enginePower; //Значение поля должно быть больше 0
    private VehicleType type; //Поле может быть null
    private FuelType fuelType; //Поле не может быть null
    public Vehicle() {
    	Scanner parser = new Scanner(System.in);
    	this.id = Long.valueOf(this.hashCode());
    	System.out.println("Введите название ТС");
    	this.name = parser.nextLine();
    	this.creationDate = LocalDate.now();
    	this.coordinates = new Coordinates();
    	System.out.println("Введите мощность двигателя (л.с)");
    	this.enginePower = parser.nextDouble();
    	this.type = VehicleType.setEnum();
    	this.fuelType = FuelType.setEnum();
    	System.out.println("Транспортное средство успешно добавлено!");
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
}


