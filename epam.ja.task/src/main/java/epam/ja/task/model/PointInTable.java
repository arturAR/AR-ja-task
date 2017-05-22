package epam.ja.task.model;

public class PointInTable {
	private int x;
	private int y;
	
	private boolean occupied = false;
	
	private String charPoint;
	
	public PointInTable(int x, int y) {
		this.x = x;
		this.y = y;
		this.charPoint = "  ";
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public boolean isOccupied() {
		return occupied;
	}
	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}
	
    public String getCharPoint() {
		return charPoint;
	}

	public void setCharPoint(String charPoint) {
		this.charPoint = charPoint;
	}

	@Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PointInTable other = (PointInTable) obj;
        return (x == other.getX() && y == other.getY());
    }
}
