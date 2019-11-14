import java.util.Vector;

public class GestPointCercle {
	public static void main(String[] args) {

        int len = args.length;
        int i = 0;
        Vector objectVector = new Vector(0);

        while(i < len) {
            if (args[i].equals("p")) {
                Point point = new Point(Integer.parseInt(args[i + 1]),
									    Integer.parseInt(args[i + 2]));
                objectVector.addElement(point);

                i += 3;
            }
            else if (args[i].equals("c")) {
                Cercle cercle = new Cercle(
                    Integer.parseInt(args[i + 1]),
					Integer.parseInt(args[i + 2]),
                    Integer.parseInt(args[i + 3])
                );
                objectVector.addElement(cercle);

                i += 4;
            }
        }

        System.out.println(objectVector);

	}
}