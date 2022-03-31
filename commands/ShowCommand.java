package commands;

import transport.CollectionManager;

public class ShowCommand extends Command {
	public void execute() {
		CollectionManager.getInstance().showCollection();
		Invoker.addHistory("show");
	}
	public void getHelp() {
		System.out.println("show : вывести в стандартный поток вывода все элементы коллекции в строковом представлении");
	}
}