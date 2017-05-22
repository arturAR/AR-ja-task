package epam.ja.task.model;

public class GameArena {
	private PointInTable[][] arena;
	
	public GameArena(int arenaSize) {
		this.arena = new PointInTable[arenaSize][arenaSize];
	}
	
	public PointInTable[][] getGameArena() {
		return arena;
	}

}
