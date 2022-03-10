package Commands;

public class HistoryCommand extends Command {
	
	protected static final int count = 11; // количество выводимых команд
	
	public void execute() {
		Invoker.getHistory();
		Invoker.addHistory("history");
	}
	public void getHelp() {
		System.out.println("history : вывести последние" + count +" команд (без их аргументов)");
	}
}