package commands;
import java.time.LocalDate;
import java.util.Scanner;

import transport.CollectionManager;
import transport.Coordinates;
import transport.FuelType;
import transport.VehicleType;

public class UpdateCommand extends Command {
	CollectionManager instance = CollectionManager.getInstance();
	public void execute(String id) {
		long my_id =Long.parseLong(id);
		instance.getCollection().values().forEach((k) -> {
			if (k.getID() == my_id) {
		    	Scanner parser = new Scanner(System.in);
		    	System.out.println("Введите название ТС");
		    	k.setName(parser.nextLine());
		    	k.setCoordinates(Coordinates.enterCoordinates());
		    	System.out.println("Введите мощность двигателя (л.с)");
		    	k.setEnginePower(parser.nextDouble());
		    	k.setType(VehicleType.enterEnum());
		    	k.setFuelType(FuelType.enterEnum());
		    	System.out.println("Транспортное средство успешно обновлено!");
			}
		});
	Invoker.addHistory("update");
	}
	public void getHelp() {
		System.out.println("update id {element} : обновить значение элемента коллекции, id которого равен заданному");
	}
}