package commands;

import transport.CollectionManager;

public class ClearCommand extends Command {
	public void execute() {
		CollectionManager instance = CollectionManager.getInstance();
		instance.clear();
		CollectionManager.setInstance(instance);
		System.out.println("Коллекция очищена!");
		Invoker.addHistory("clear");
	}
	public void getHelp() {
		System.out.println("clear : очистить коллекцию");
	}
}