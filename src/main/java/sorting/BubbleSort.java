package sorting;

import java.util.Collections;
import java.util.List;
/*
 * bubblesort confronta gli elementi adiacenti se il precedente e maggiore 
 * viene swappato, bubble perche gli elementi piu grandi salgono sopra come una bolla
 */
public class BubbleSort {
	public static List<Integer> bubbleSort(List<Integer> arr) {
		for(int i = 0; i < arr.size(); i++) {
			for (int j = 0; j < arr.size() - i - 1; j++) {
				if (arr.get(j) > arr.get(j + 1)) {
					Collections.swap(arr, j, j + 1);
				}
			}
		}
		return arr;
	}
}
