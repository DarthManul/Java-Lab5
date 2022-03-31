package commands;

import java.util.stream.*;

import transport.CollectionManager;
import transport.Vehicle;

import java.util.HashMap;
import java.util.function.Supplier;

public class SumOfEnginePowerCommand extends Command {
	private static double sum = 0;
	public void execute() {
		
		HashMap<String, Vehicle> collection = CollectionManager.getInstance().getCollection();
		collection.values().forEach(k-> {sum += k.getEnginePower();});
		System.out.println("Суммарная мощность равна "+ sum +" л.с");
		Invoker.addHistory("sum_of_engine_power");
		sum = 0;
	}
	public void getHelp() {
		System.out.println("sum_of_engine_power : вывести сумму значений поля enginePower для всех элементов коллекции");
	}
}
