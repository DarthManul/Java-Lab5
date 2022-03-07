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
    	Command help = new HelpCommand();
    	Command info = new InfoCommand();
    	Command show = new ShowCommand();
    	Command insert = new InsertCommand();
    	Command update = new UpdateCommand();
    	Command remove_key = new RemoveKeyCommand();
    	Command clear = new ClearCommand();
    	Command save = new SaveCommand();
    	Command execute_script = new ExecuteScriptCommand();
    	Command exit = new ExitCommand();
    	Command remove_lower = new RemoveLowerCommand();
    	Command history = new HistoryCommand();
    	Command replace_if_lower = new ReplaceIfLowerCommand();
    	Command sum_of_engine_power = new SumOfEnginePowerCommand();
    	Command average_of_engine_power = new AverageOfEnginePowerCommand();
    	Command print_field_descending_fuel_type = new PrintFieldDescendingFuelTypeCommand();
    	
    	this.register("help", help);
    	this.register("info", info);
    	this.register("show", show);
    	this.register("insert", insert);
    	this.register("update", update);
    	this.register("remove_key", remove_key);
    	this.register("clear", clear);
    	this.register("save", save);
    	this.register("execute_script", execute_script);
    	this.register("exit", exit);
    	this.register("remove_lower", remove_lower);
    	this.register("history", history);
    	this.register("replace_if_lower", replace_if_lower);
    	this.register("sum_of_engine_power", sum_of_engine_power);
    	this.register("average_of_engine_power", average_of_engine_power);
    	this.register("print_field_descending_fuel_type", print_field_descending_fuel_type);
    	
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
        if (command == null) {
            throw new IllegalStateException("no command registered for " + commandName);
        }
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
    	while (!hist.isEmpty() | count == 0) {
    		System.out.println(hist.pop());
    		count--;
    		}
    	}
    }
    
}
