
public class GestPoint {

	public static void main(String[] args) {
		if (args.length % 2 == 0) {
			Point pointArray[] = new Point[args.length / 2];
			for (int i = 0; i < (args.length / 2); i++) {
				pointArray[i] = new Point(
						Integer.parseInt(args[2 * i]),
						Integer.parseInt(args[2 * i + 1])
						);
				System.out.println(pointArray[i]);
			}
			pointArray = (Point[]) Trier.tri(pointArray);
			System.out.println("-----------------------------");
			for (int i = 0; i < pointArray.length; i++) {
				System.out.println(pointArray[i]);
			}
		}
	}
}
