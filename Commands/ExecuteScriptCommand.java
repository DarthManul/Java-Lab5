package Commands;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.File;

class ExecuteScriptCommand extends Command {
	
	public void execute(String args) {
		//execute_script ./src/scripts/script.txt
		Path path = Paths.get(args);
		Invoker invoker = new Invoker();
		try {
		Scanner scanner = new Scanner(path);
		while(scanner.hasNext()) {
			String cmd = scanner.nextLine();
			invoker.execute(cmd);
		}
		scanner.close();
		} 
		catch(IOException e) {
			System.out.println("Ошибочка вышла");			
		}
		
	}
	public void getHelp() {
		System.out.println("execute_script file_name : считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.");
	}
}
