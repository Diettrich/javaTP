public class Cercle extends Point {
    // super;
    int r;

    Cercle(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }

    Cercle() { this(0, 0, 0); }

    int getX() { return super.getX(); }
    int getY() { return super.getY(); }
    int getR() { return this.r; }

    public String toString() {
        return super.toString() + " r = " + this.r;
    }
}
