package Commands;

import Transport.VehicleCollection;

public class ShowCommand extends Command {
	public void execute() {
		VehicleCollection.show();
		Invoker.addHistory("show");
	}
	public void getHelp() {
		System.out.println("show : вывести в стандартный поток вывода все элементы коллекции в строковом представлении");
	}
}