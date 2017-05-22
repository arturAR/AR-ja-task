package epam.ja.task;

import java.util.InputMismatchException;
import java.util.Scanner;

import epam.ja.task.businessLogic.ArenaOperations;
import epam.ja.task.businessLogic.GameEngine;
import epam.ja.task.model.GameArena;

public class StartGame {
	
	private static int arenaSize;
	private static int whoStart;
	private Controller controller;

	public static void main(String[] args) {
		do {
			showStartMenu();
		} while(arenaSize <= 0);
		ArenaOperations operations = new ArenaOperations(arenaSize);
		GameArena arena = operations.getArena();
		TablePrinter printer = new TablePrinter();
		printer.printArena(arena);
		do {
			showWhoStart();
		} while(whoStart != 1 && whoStart != 2);
		
		GameEngine gameEngine = new GameEngine(arena);
		gameEngine.doGame(whoStart);
		
	}
	
	
	
	private static void showWhoStart() {
		System.out.println("Kto rozpoczyna grê? Wybierz 1 dla 'X' lub 2 dla 'O'");
		whoStart = readIntByScanner();
		if(whoStart == 1) {
			System.out.println("Rozpoczyna gracz: 'X'");
		}
		if(whoStart == 2) {
			System.out.println("Rozpoczyna gracz: 'O'");
		}
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
			Controller controller = new Controller();
			number = controller.getReturnInt();
		} catch(InputMismatchException e) {
			System.out.println("Podano niepawid³owe dane, proszê spróbowaæ ponownie.");
			return number;
		}
		return number;
	}

}
