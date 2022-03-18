package Commands;

import Transport.VehicleCollection;

public class InfoCommand extends Command {
	public void execute() {
		System.out.println("Информация о коллекции:\n "
				+ "Тип: коллекция транспортных средств\n "
				+ "Количество элементов: "+ VehicleCollection.numberOfElements() 
				+ "\n Дата инициализации: "+ VehicleCollection.creationDate);
	}
	public void getHelp() {
		System.out.println("info : вывести в стандартный поток вывода информацию о коллекции \n (тип, дата инициализации, количество элементов и т.д.)");
	}
}

