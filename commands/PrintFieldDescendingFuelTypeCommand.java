package commands;

import java.util.Comparator;

import transport.*;

public class PrintFieldDescendingFuelTypeCommand extends Command {
	public void execute() {
		CollectionManager instance = CollectionManager.getInstance();
		instance.getCollection().values().stream()
								.sorted(new Comparator<Vehicle>() {
								    public int compare(Vehicle v1, Vehicle v2) {
								    	if ((v1.getEnginePower() - v2.getEnginePower()) <0) return 1;
								    	if ((v1.getEnginePower() - v2.getEnginePower()) >0) return -1;
								    	return 0;
								    }
								    })
								.map(v -> v.getFuelType())
								.forEachOrdered(System.out::println);
	}
	public void getHelp() {
		System.out.println("print_field_descending_fuel_type : вывести значения поля fuelType всех элементов в порядке убывания");
	}
}