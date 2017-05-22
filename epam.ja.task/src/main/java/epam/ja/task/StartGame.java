package epam.ja.task;

import java.util.InputMismatchException;
import java.util.Scanner;

import epam.ja.task.businessLogic.ArenaOperations;
import epam.ja.task.model.GameArena;

public class StartGame {
	
	private static int arenaSize;
	private static Scanner scanner;

	public static void main(String[] args) {
		do {
			showStartMenu();
		} while(arenaSize <= 0);
		ArenaOperations operations = new ArenaOperations(arenaSize);
		GameArena arena = operations.getArena();
		TablePrinter printer = new TablePrinter();
		printer.printArena(arena);
		
		
	}
	
	public static void showStartMenu() {
		System.out.println("START!");
		System.out.println("Podaj rozmiar planszy(liczba naturalna) i zatwierdz ENTER: ");
		arenaSize = readIntByScanner();
		System.out.println("Rozmiar planszy: " + arenaSize);
		
	}
	
	public static int readIntByScanner() {
		int number = 0;
		try{
			scanner = new Scanner(System.in); 
			number = scanner.nextInt();
		} catch(InputMismatchException e) {
			System.out.println("Podano niepawid³owe dane, proszê spróbowaæ ponownie.");
			return number;
		}
		return number;
	}

}
