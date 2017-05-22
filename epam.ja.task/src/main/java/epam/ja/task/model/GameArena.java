package epam.ja.task.model;

public class GameArena {
	private PointInTable[][] arena;
	private int amountOfPoints;
	
	public GameArena(int arenaSize) {
		this.arena = new PointInTable[arenaSize][arenaSize];
		this.amountOfPoints = arenaSize * arenaSize;
	}
	
	public PointInTable[][] getGameArena() {
		return arena;
	}

	public int getAmountOfPoints() {
		return amountOfPoints;
	}
}
