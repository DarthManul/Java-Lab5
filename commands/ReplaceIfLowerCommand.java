package commands;
import transport.CollectionManager;
import transport.Vehicle;

public class ReplaceIfLowerCommand extends Command {
	public void execute(String key) {
		CollectionManager collection = CollectionManager.getInstance();
		Vehicle vehicle = Vehicle.enterNewVehicle();
		if (collection.getCollection().get(key).compareTo(vehicle) > 0) {
			collection.getCollection().replace(key, vehicle);
		} else {
			System.out.println("Замена не удалась: транспортное средство более мощное, чем то, что надо было заменить");
		}
	}
	public void getHelp() {
		System.out.println("replace_if_lower null {element} : заменить значение по ключу, если новое значение меньше старого");
	}
}