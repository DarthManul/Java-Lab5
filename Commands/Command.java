package Commands;

public abstract class Command {
	private String name;
	public void execute() {
		System.out.println("Эта команда не поддерживает ввод без аргумента. Попробуйте ввести аргумент");
	}
	public void execute(String arg) {
		System.out.println("Эта команда не поддерживает ввод аргументов. Попробуйте ещё раз");
	}
	public void getHelp() {}
	@Override
	public String toString() {
		return name;
	}
}
