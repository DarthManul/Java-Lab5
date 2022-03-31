package commands;

import transport.CollectionManager;
import xml.XMLwriter;

class SaveCommand extends Command {
	public void execute() {
		try {
		XMLwriter writer = new XMLwriter();
		writer.write();
		Invoker.addHistory("save");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	public void getHelp() {
		System.out.println("save : сохранить коллекцию в файл");
	}
}