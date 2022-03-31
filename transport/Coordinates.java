package transport;
import java.util.Scanner;



public class Coordinates {

    private long x; //Значение поля должно быть больше -755

    private Long y; //Поле не может быть null
    public Coordinates() {

    }
    public Coordinates(long x, Long y) {
    	this.x = x;
    	this.y = y;
    }
    public static Coordinates enterCoordinates() {
    	Coordinates coords = new Coordinates();
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Введите координату х");
    	coords.x = scanner.nextLong();
    	while (coords.x<-755) {
    		System.out.println("Ошибка. х должен быть больше -755");
    		coords.x = scanner.nextLong();
    	}
    	System.out.println("Введите координату у");
    	coords.y = Long.valueOf(scanner.nextLong());
    	return coords;
    }
    public long getX() {
    	return x;
    }
    public Long getY() {
    	return y;
    }
    public void setX(long x) {
    	this.x = x;
    }
    public void setY(Long y) {
    	this.y = y;
    }
    public String toString() {
    	return "("+x+","+y+")";
    }
}