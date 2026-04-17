package sorting;


import java.util.List;
/*
 * Controlla se array e sorted. Se non lo e rimuove randomicamente meta 
 * degli elementi finche non e sorted.
 * 
 * scommenta il syso per vedere come rimuove elementi a caso
 * 
 * complessita O(n^2) circa (algoritmo randomico :P)
 */
public class ThanosSort {
	private static boolean isSorted(List<Integer>arr) {
		for (int i = 0; i < arr.size() - 1; i++) {
			if (arr.get(i) > arr.get(i + 1)) 
				return false;
		}
		return true;
	}
	
	public static List<Integer> sort(List<Integer> arr) {
		
		
		while(!isSorted(arr)) {
			System.out.println(arr);
			int half  = arr.size() / 2;
			for (int i = 0; i < half; i++) {
				int r = (int) (Math.random() * arr.size());
				arr.remove(r);
			}
		}
		return arr;
		
		
	}

}
