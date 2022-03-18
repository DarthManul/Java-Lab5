package Commands;
// Здесь сидят все нереализованные команды







class UpdateCommand extends Command {
	public void execute() {
		System.out.println("Update command");
	}
	public void getHelp() {
		System.out.println("update id {element} : обновить значение элемента коллекции, id которого равен заданному");
	}
}

class RemoveKeyCommand extends Command {
	public void execute() {
		System.out.println("remove_key command");
	}
	public void getHelp() {
		System.out.println("remove_key null : удалить элемент из коллекции по его ключу");
	}
}

class ClearCommand extends Command {
	public void execute() {
		System.out.println("Clear command");
	}
	public void getHelp() {
		System.out.println("clear : очистить коллекцию");
	}
}





class RemoveLowerCommand extends Command {
	public void execute() {
		System.out.println("Remove_lover command");
	}
	public void getHelp() {
		System.out.println("remove_lower {element} : удалить из коллекции все элементы, меньшие, чем заданный");
	}
}



class ReplaceIfLowerCommand extends Command {
	public void execute() {
		System.out.println("Replace_If_Lower command");
	}
	public void getHelp() {
		System.out.println("replace_if_lower null {element} : заменить значение по ключу, если новое значение меньше старого");
	}
}

class SumOfEnginePowerCommand extends Command {
	public void execute() {
		System.out.println("Sum_of_engine_power command");
	}
	public void getHelp() {
		System.out.println("sum_of_engine_power : вывести сумму значений поля enginePower для всех элементов коллекции");
	}
}

class AverageOfEnginePowerCommand extends Command {
	public void execute() {
		System.out.println("Average_of_engine_power command");
	}
	public void getHelp() {
		System.out.println("average_of_engine_power : вывести среднее значение поля enginePower для всех элементов коллекции");
	}
}

class PrintFieldDescendingFuelTypeCommand extends Command {
	public void execute() {
		System.out.println("Print Field descending fuel type");
	}
	public void getHelp() {
		System.out.println("print_field_descending_fuel_type : вывести значения поля fuelType всех элементов в порядке убывания");
	}
}