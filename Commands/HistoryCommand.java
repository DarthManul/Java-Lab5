package Commands;

public class HistoryCommand extends Command {
	
	private int count = 11; // количество выводимых команд
	
	public void execute() {
		Invoker.getHistory(count);
		Invoker.addHistory("history");
	}
	public void getHelp() {
		System.out.println("history : вывести последние" + Integer.toString(count)+" команд (без их аргументов)");
	}
}