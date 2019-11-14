import java.util.Vector;

public class GestPointVector {
	public static void main(String[] args) {
		if (args.length % 2 == 0) {
            Vector pointVector = new Vector(0);
			for (int i = 0; i < (args.length / 2); i++) {
                Point point = new Point(Integer.parseInt(args[2 * i]),
									    Integer.parseInt(args[2 * i + 1])
										);
                pointVector.addElement(point);
                
			}
		}

	}
}
