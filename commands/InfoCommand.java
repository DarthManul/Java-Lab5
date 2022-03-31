package commands;

import transport.*;

public class InfoCommand extends Command {
	public void execute() {
		System.out.println(CollectionManager.getInstance().info());
		Invoker.addHistory("info");
	}
		
	public void getHelp() {
		System.out.println("info : вывести в стандартный поток вывода информацию о коллекции \n (тип, дата инициализации, количество элементов и т.д.)");
	}
}

