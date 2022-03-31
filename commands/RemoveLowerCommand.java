package commands;
import java.util.Stack;

import transport.CollectionManager;

public class RemoveLowerCommand extends Command {
	public void execute(String key) {
		CollectionManager instance = CollectionManager.getInstance();
		Stack<String> stack = new Stack<>();
		 instance.getCollection().keySet().forEach(k ->{
		 if ((instance.getCollection().get(key).compareTo(instance.getCollection().get(k))) > 0 ) {
			 stack.add(k);
		 }
		 });
		 while (!stack.empty()) {
			 instance.removeByKey(stack.pop());
		 }
			
	}
	public void getHelp() {
		System.out.println("remove_lower {element} : удалить из коллекции все элементы, меньшие, чем заданный");
	}
}
