
public class Point implements Compare {

	// position
	int x;
	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Point() { this(0, 0); }
	
	public int getX() { return this.x; }
	public int getY() { return this.y; }

	public String toString() {
		return "Point:" + " x = " + this.x + " y = " + this.y;
	}
	@Override
	public int sort(Object o) {
		Point p = (Point) o;
		if(this.x == p.getX())
			return 0;
		else if(this.x > p.getX())
			return 1;
		else
			return -1;
	}
}
