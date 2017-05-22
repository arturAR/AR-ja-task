package epam.ja.task;

import java.util.Scanner;

public class Controller {
	private Scanner scanner;
	
	public Controller() {
		scanner = new Scanner(System.in);
	}

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	public int getReturnInt() {
		return scanner.nextInt();
	}

}
