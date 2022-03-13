package Commands;
import Transport.*;

class InsertCommand extends Command {
	public void execute(String arg) {
		VehicleCollection.add(arg, new Vehicle());
		Invoker.addHistory("insert");
		
	}
	public void getHelp() {
		System.out.println("insert null {element} : добавить новый элемент с заданным ключом");
	}
}