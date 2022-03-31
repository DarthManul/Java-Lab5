package commands;

import transport.CollectionManager;

public class RemoveKeyCommand extends Command {
	public void execute(String key) {
		CollectionManager instance = CollectionManager.getInstance();
		instance.removeByKey(key);
		CollectionManager.setInstance(instance);
		System.out.println("Элемент "+key+" удалён!");
		Invoker.addHistory("remove_key");
	}
	public void getHelp() {
		System.out.println("remove_key null : удалить элемент из коллекции по его ключу");
	}
}