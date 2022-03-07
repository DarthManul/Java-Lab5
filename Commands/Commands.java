package Commands;



class InfoCommand extends Command {
	public void execute() {
		System.out.println("Info");
	}
	public void getHelp() {
		System.out.println("info : вывести в стандартный поток вывода информацию о коллекции \n (тип, дата инициализации, количество элементов и т.д.)");
	}
}

class ShowCommand extends Command {
	public void execute() {
		System.out.println("Show");
	}
	public void getHelp() {
		System.out.println("show : вывести в стандартный поток вывода все элементы коллекции в строковом представлении");
	}
}



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

class SaveCommand extends Command {
	public void execute() {
		System.out.println("Save command");
	}
	public void getHelp() {
		System.out.println("save : сохранить коллекцию в файл");
	}
}

class ExecuteScriptCommand extends Command {
	public void execute() {
		System.out.println("Execute_script command");
	}
	public void getHelp() {
		System.out.println("execute_script file_name : считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.");
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