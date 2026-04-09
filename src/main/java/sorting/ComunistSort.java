package sorting;


import java.util.List;
import java.util.stream.Collectors;

/*
 * rende tutti gli elementi uguali alla media di essi 
 * 
 * complessita O(n)
 */

public class ComunistSort {
	public static List<Integer> sort(List<Integer> arr) {
		if (arr.isEmpty())
			return arr;
		// :(
		int average = (int) Math.floor(arr.stream()
				.collect(Collectors.averagingDouble(n -> n))
				); 
		for (int i = 0; i < arr.size(); i++) {
			arr.set(i, average);
		}
		return arr;
	}
}
