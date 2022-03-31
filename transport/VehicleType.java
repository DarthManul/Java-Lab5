package transport;
import java.util.Scanner;

public enum VehicleType {
    CAR,
    PLANE,
    DRONE,
    BOAT,
    HOVERBOARD;
	public static VehicleType enterEnum() {
		System.out.println("Выберите тип транспортного средства:\n"
				+ "1 - Аааавтомобиль\n"
				+ "2 - Кукурузник\n"
				+ "3 - Дрон. Просто Дрон\n"
				+ "4 - Лодочка\n"
				+ "5 - Ховерборд. Как у Марти Макфлая\n");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		switch (number) {
		case 1:
			return VehicleType.CAR;
		case 2:
			return VehicleType.PLANE;
		case 3:
			return VehicleType.DRONE;
		case 4:
			return VehicleType.BOAT;
		case 5:
			return VehicleType.HOVERBOARD;
		default:
			return null;
		}
	}
	public static VehicleType setEnum(String str) {
		switch (str) {
		case "CAR":
			return VehicleType.CAR;
		case "PLANE":
			return VehicleType.PLANE;
		case "DRONE":
			return VehicleType.DRONE;
		case "BOAT":
			return VehicleType.BOAT;
		case "HOVERBOARD":
			return VehicleType.HOVERBOARD;
		default:
			return null;
		}
	}
}