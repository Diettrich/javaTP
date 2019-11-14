
public class GestPoint {

	public static void main(String[] args) {
		Point p1 = new Point(1000, 1000);
		try {
			p1.deplacer(100000, 100000);
		}
		catch(ExceptionDeplacement e) {
			System.out.println(e.getMessage());
		}
		System.out.println(p1.getX());
		//System.out.println();
		try {
			p1.deplacer(1, 1);
			System.out.println("all good");
		} catch (ExceptionDeplacement e) {
			System.out.println("erreur2");
		}
	}

}
