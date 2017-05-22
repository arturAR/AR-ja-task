package epam.ja.task;

import java.util.InputMismatchException;
import java.util.Scanner;

import epam.ja.task.businessLogic.ArenaOperations;
import epam.ja.task.businessLogic.GameEngine;
import epam.ja.task.model.GameArena;

public class StartGame {
	
	private static Controller controller;

	public static void main(String[] args) {
		controller = new Controller();
		View view = new View(controller);
		do {
			view.showStartMenu();
		} while(view.getArenaSize() <= 0);
		ArenaOperations operations = new ArenaOperations(view.getArenaSize());
		GameArena arena = operations.getArena();
		TablePrinter printer = new TablePrinter();
		printer.printArena(arena);
		do {
			view.showWhoStart();
		} while(view.getWhoStart() != 1 && view.getWhoStart() != 2);
		
		GameEngine gameEngine = new GameEngine(arena, controller, view, printer);
		gameEngine.doGame(view.getWhoStart());
		
	}


	
	public static int readIntByScanner() {
		int number = 0;
		try{
			number = controller.getReturnInt();
		} catch(InputMismatchException e) {
			System.out.println("Podano niepawid³owe dane, proszê spróbowaæ ponownie.");
			return number;
		}
		return number;
	}

}
