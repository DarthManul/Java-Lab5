package Commands;

import java.util.ArrayList;

public class HelpCommand extends Command {
	public void execute() {
		ArrayList<String> coms = Invoker.getKeys();
		int n = coms.size();
		Invoker inv = new Invoker();
		for (int i=0; i<n; i++) {
			inv.getHelp(coms.get(i));
		}
		Invoker.addHistory("help");
		
	}
	public void getHelp() {
		System.out.println("help: вывести справку по доступным командам");
	}

}
