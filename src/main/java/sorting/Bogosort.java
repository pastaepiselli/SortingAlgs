package sorting;

import java.util.Collections;
import java.util.List;
/*
 * bogosort o stupid sort semplicemente controlla se la lista e sorted
 * se non lo e shuffla tutti gli elementi finche non e sorted, con liste con tanti numeri
 * o numeri grandi puo metterci un sacco come metterci poco
 * 
 * notazione media O(n^2 * n!), caso ottimale O(n)
 */

public class Bogosort {
	public static boolean isSorted(List<Integer> arr) {
		for (int i = 1; i < arr.size(); i++) {
			if (arr.get(i) < arr.get(i - 1)) {
				return false;
			}
		}
		return true;
	}
	
	public static List<Integer> bogosort(List<Integer> arr){
		while(!isSorted(arr)) {
			Collections.shuffle(arr);
		}
		return arr;
	}
}
