package Commands;

class InsertCommand extends Command {
	public void execute(String arg) {
		System.out.println("Insert" + arg);
	}
	public void getHelp() {
		System.out.println("insert null {element} : добавить новый элемент с заданным ключом");
	}
}