package epam.ja.task.businessLogic;

import epam.ja.task.model.GameArena;
import epam.ja.task.model.PointInTable;

public class ArenaOperations {
	private GameArena arena;
	
	public ArenaOperations(int size) {
		this.arena = new GameArena(size);
	}
	
	public GameArena getArena() {
		return arena;
	}
	
	public void setPoint(PointInTable point) {
		if(pointIsNotOccupied(point)) {
			point.setOccupied(true);
			arena.getGameArena()[point.getX()-1][point.getY()-1] = point;
		}
	}

	private boolean pointIsNotOccupied(PointInTable point) {
		int x = point.getX();
		int y = point.getY();
		PointInTable checkedPoint = arena.getGameArena()[x-1][y-1];
		if(checkedPoint == null) {
			return true;
		}
		return false;
	}
}
