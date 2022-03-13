package Transport;
import java.util.Scanner;


public class Coordinates {
    private long x; //Значение поля должно быть больше -755
    private Long y; //Поле не может быть null
    public Coordinates() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Введите координату х");
    	this.x = scanner.nextLong();
    	while (x<-755) {
    		System.out.println("Ошибка. х должен быть больше -755");
    		this.x = scanner.nextLong();
    	}
    	System.out.println("Введите координату у");
    	this.y = Long.valueOf(scanner.nextLong());
    }
    public String toString() {
    	return "("+x+","+y+")";
    }
}