package epam.ja.task.model;

public class GameArena {
	private PointInTable[][] arena;
	private int amountOfPoints;
	
	public GameArena(int arenaSize) {
		this.arena = new PointInTable[arenaSize][arenaSize];
		this.amountOfPoints = arenaSize * arenaSize;
		for(int x = 0 ; x < arenaSize; x++) {
			for(int y = 0 ; y < arenaSize; y++) {
				arena[x][y] = new PointInTable(x, y);
			}
		}
	}
	
	public PointInTable[][] getGameArena() {
		return arena;
	}

	public int getAmountOfPoints() {
		return amountOfPoints;
	}
}
