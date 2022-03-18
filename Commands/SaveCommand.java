package Commands;

import Transport.VehicleCollection;
import XML.XMLparser;

class SaveCommand extends Command {
	public void execute() {
		try {
		XMLparser.toXML();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	public void getHelp() {
		System.out.println("save : сохранить коллекцию в файл");
	}
}