package Transport;

import java.util.Scanner;


public enum FuelType {
    GASOLINE,
    ELECTRICITY,
    MANPOWER,
    NUCLEAR,
    PLASMA;
	public static FuelType setEnum() {
		System.out.println("Выберите тип топлива:\n"
				+ "1 - Бензин\n"
				+ "2 - Электроугли\n"
				+ "3 - Человечья СИЛА\n"
				+ "4 - Ядреное топливо\n"
				+ "5 - Плазма. Сила звезды!\n");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		switch (number) {
		case 1:
			return FuelType.GASOLINE;
		case 2:
			return FuelType.ELECTRICITY;
		case 3:
			return FuelType.MANPOWER;
		case 4:
			return FuelType.NUCLEAR;
		case 5:
			return FuelType.PLASMA;
		default:
			return null;
		}
}
}
