package commands;

import java.util.HashMap;

import transport.CollectionManager;
import transport.Vehicle;

public class AverageOfEnginePowerCommand extends Command {

	private static double avg = 0;
	public void execute() {
		HashMap<String, Vehicle> collection = CollectionManager.getInstance().getCollection();
		collection.values().forEach(k-> {avg += k.getEnginePower();});
		avg = avg/collection.size();
		System.out.println("Суммарная мощность равна "+ avg +" л.с");
		Invoker.addHistory("average_of_engine_power");
		avg = 0;
		}
	
	public void getHelp() {
		System.out.println("average_of_engine_power : вывести среднее значение поля enginePower для всех элементов коллекции");
	}
}
