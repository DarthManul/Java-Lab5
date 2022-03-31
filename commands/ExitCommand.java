package commands;

import java.util.Scanner;

public class ExitCommand extends Command {
	private String name = "exit";
	public void execute() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Вы действительно хотите выйти? y/n");
		if (scan.next().equals("y")) {
			System.out.println("Сохранить? y/n");
			if (scan.next().equals("y")) {
				SaveCommand save = new SaveCommand();
				save.execute();
				scan.close();
				System.exit(0);
			}
			else {
				scan.close();
				System.exit(0);}
		}
		scan.close();
	}
	public void getHelp() {
		System.out.println("exit : завершить программу (без сохранения в файл)");
	}
}
