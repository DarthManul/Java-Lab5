package commands;
import transport.*;

class InsertCommand extends Command {
	public void execute(String arg) {
		CollectionManager collection = CollectionManager.getInstance();
		collection.add(arg, Vehicle.enterNewVehicle());
		Invoker.addHistory("insert");
		
	}
	public void getHelp() {
		System.out.println("insert null {element} : добавить новый элемент с заданным ключом");
	}
}