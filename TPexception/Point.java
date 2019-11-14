
public class Point {
	// position
	int x;
	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Point() {this(0, 0);}
	
	// comportement
	public void deplacer(int dx, int dy) throws ExceptionDeplacement{
		x += dx;
		y += dy;
		if (dx > 0.1 * this.x || dy > 0.1 * this.y) {
			throw new ExceptionDeplacement("erreur akhay");
		}
	}
	public int getX() {return this.x;}
	public int getY() {return this.y;}

	public String toString() {

		return "Point: x = " + this.x + " y = " + this.y;
	}
}
