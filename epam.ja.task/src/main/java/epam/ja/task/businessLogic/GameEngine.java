package epam.ja.task.businessLogic;

import epam.ja.task.Controller;
import epam.ja.task.TablePrinter;
import epam.ja.task.View;
import epam.ja.task.model.GameArena;
import epam.ja.task.model.PointInTable;

public class GameEngine {
	private boolean someoneWin = false;
	private GameArena arena;
	private int amountOfOccupiedPoints;
	private Controller controller;
	private View view;
	private TablePrinter printer;
	
	public GameEngine(GameArena arena, Controller controller, View view, TablePrinter printer) {
		this.arena = arena;
		this.controller = controller;
		this.view = view;
		this.printer = printer;
	}
	
	public boolean setUserChar(PointInTable point, String userChar) {
		if(!point.isOccupied()) {
			point.setCharPoint(userChar);
			point.setOccupied(true);
			return false;
		}
		return true;
	}
	
	public void checkHorizontalAndVertical(String userChar) {
		for(int x = 0; x < arena.getGameArena()[0].length; x++) {
			int cntVertical = 0;
			int cntHorizontal = 0;
			for(int y = 0; y < arena.getGameArena()[0].length; y++) {
				if(arena.getGameArena()[x][y].getCharPoint().equals(userChar)) {
					cntVertical++;
				}
			}
			for(int y = 0; y < arena.getGameArena()[0].length; y++) {
				if(arena.getGameArena()[y][x].getCharPoint().equals(userChar)) {
					cntHorizontal++;
				}
			}
			if(cntVertical == arena.getGameArena()[0].length || cntHorizontal == arena.getGameArena()[0].length) {
				someoneWin = true;
			}
		}
	}
	
	public void checkDiagonal(String userChar) {
		for(int x = 0; x < arena.getGameArena()[0].length; x++) {
			for(int y = 0; y < arena.getGameArena()[0].length; y++) {
				if(x == y && userChar.equals(arena.getGameArena()[x][y].getCharPoint())) {
					someoneWin = true;
				}
			}
		}
	}
	
	public void checkSomeoneWin(String userChar) {
		checkDiagonal(userChar);
		checkHorizontalAndVertical(userChar);
	}

	public void doGame(int whoStart) {
		int moveId = whoStart;
		do {
			view.showWhoPlay(moveId);
			Boolean flag;
			view.showGameMenu();
			if(moveId % 2 == 0) {
				flag = setUserChar(arena.getGameArena()[view.getxTemp()-1][view.getyTemp()-1], "O");
				checkSomeoneWin("O");
			} else {
				flag = setUserChar(arena.getGameArena()[view.getxTemp()-1][view.getyTemp()-1], "X");
				checkSomeoneWin("X");
			}
			printer.printArena(arena);
			if(!flag) {
				moveId++;
			} else {
				System.out.println("\nWspó³rzêdne zajête, podaj inne.");
			}	
			
		} while(amountOfOccupiedPoints != arena.getAmountOfPoints() || someoneWin);
		view.showResult(moveId);
	}
	
	
}
