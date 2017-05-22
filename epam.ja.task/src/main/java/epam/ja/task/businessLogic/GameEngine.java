package epam.ja.task.businessLogic;

import epam.ja.task.model.GameArena;

public class GameEngine {
	private boolean someoneWin = false;
	private GameArena arena;
	private int amountOfOccupiedPoints;
	
	public GameEngine(GameArena arena) {
		this.arena = arena;
	}
	
	public void setUserChar(int x, int y, String userChar) {
		arena.getGameArena()[x][y].setCharPoint(userChar);
		arena.getGameArena()[x][y].setOccupied(true);
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
		
	}
	
	public void checkSomeoneWin(String userChar) {
		checkDiagonal(userChar);
		checkHorizontalAndVertical(userChar);
	}

	public void doGame(int whoStart) {
		int moveId = 0;
		do {
			
			
		} while(amountOfOccupiedPoints != arena.getAmountOfPoints() || someoneWin);
	}
	
	
}
