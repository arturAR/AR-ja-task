package epam.ja.task;

import epam.ja.task.model.GameArena;
import epam.ja.task.model.PointInTable;

public class TablePrinter {
	
	public void printArena(GameArena arena) {
		PointInTable[][] playArena = arena.getGameArena();
		for(int x = 0; x < playArena[0].length; x++) {
			System.out.println();
			for(int y = 0; y < playArena[2].length; y++) {
				System.out.print("  |" +  printPoint(playArena[x][y]) );
			}
		}
	}
	
	public String printPoint(PointInTable point) {
		if(point.getCharPoint() == null) {
			return "  ";
		}
		return point.getCharPoint();
	}
}
