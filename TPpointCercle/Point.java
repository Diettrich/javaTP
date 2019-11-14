public class Point {
	// position
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	Point() {this(0, 0);}
	// comportement
	void deplacer(int dx, int dy){
		x += dx;
		y += dy;
	}
	int getX() {return this.x;}
	int getY() {return this.y;}

	public String toString() {
		Class classObject = getClass();

		return classObject.getName() + "x = " + this.x + " y = " + this.y;
	}
}
