package Commands;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;


public class Invoker {
    private static HashMap<String, Command> commandMap = new HashMap<>();
    private static Stack<String> history = new Stack<String>();
    
    public Invoker() {
    	
    	this.register("help", new HelpCommand());
    	this.register("info", new InfoCommand());
    	this.register("show", new ShowCommand());
    	this.register("insert", new InsertCommand());
    	this.register("update", new UpdateCommand());
    	this.register("remove_key", new RemoveKeyCommand());
    	this.register("clear", new ClearCommand());
    	this.register("save", new SaveCommand());
    	this.register("execute_script", new ExecuteScriptCommand());
    	this.register("exit", new ExitCommand());
    	this.register("remove_lower", new RemoveLowerCommand());
    	this.register("history", new HistoryCommand());
    	this.register("replace_if_lower", new ReplaceIfLowerCommand());
    	this.register("sum_of_engine_power", new SumOfEnginePowerCommand());
    	this.register("average_of_engine_power", new AverageOfEnginePowerCommand());
    	this.register("print_field_descending_fuel_type", new PrintFieldDescendingFuelTypeCommand());
    	
    }
    
    public void register(String commandName, Command command) {
        commandMap.put(commandName, command);
    } 
    
    public void execute(String commandName) {
        Command command = commandMap.get(commandName);
        if (command == null) {
            throw new IllegalStateException("no command registered for " + commandName);
        }
        command.execute();
    }
    public void execute(String commandName,  String arg) {
        Command command = commandMap.get(commandName);
        if (command == null) {
            throw new IllegalStateException("no command registered for " + commandName);
        }
        command.execute(arg);
    }
    public void getHelp(String commandName) {
        Command command = commandMap.get(commandName);
        command.getHelp();
    }
    public static ArrayList<String> getKeys() {
    	ArrayList<String> keys = new ArrayList<>();
    	commandMap.keySet().forEach(k -> {
    		keys.add(k);
    	});
    	return(keys);
    }
    public static void addHistory(String command){
    	history.add(command);
    }
    public static void getHistory(int count) {
    	Stack<String> hist = history;
    	if (hist.isEmpty()) {System.out.println("История пуста!");} 
    	else {
    	System.out.println("История последних "+ Integer.toString(count) +" команд:");
    	while (!hist.isEmpty() || count == 0) {
    		System.out.println(hist.pop());
    		count--;
    		}
    	}
    }
    
}
