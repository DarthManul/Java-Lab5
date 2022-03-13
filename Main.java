import java.util.Scanner;
import Commands.Invoker;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;

public class Main {
public static void main(String[] path) {
	Invoker invoker = new Invoker();
	Scanner parser = new Scanner(System.in);
	while (true) {	

		String str = parser.nextLine();
		String[] args = str.split(" ");
		try {
		try {invoker.execute(args[0], args[1]);}
		catch (ArrayIndexOutOfBoundsException e) {
			invoker.execute(args[0]);
		}
		} catch (IllegalStateException e) {
			System.out.println("Нет такой команды! Пропробуй ещё раз");
		}
	
	}
	}
}
