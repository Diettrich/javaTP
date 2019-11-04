
public abstract class Trier {
	
	public static Compare[] tri(Compare[] array) {
		
		Compare tmp;
		for (int i = array.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {  
				if (array[j+1].sort(array[j]) == -1) {
                        tmp = array[j+1];  
                        array[j+1] = array[j];  
                        array[j] = tmp;  
				}
            }
		}
		return array;
	}	
}
