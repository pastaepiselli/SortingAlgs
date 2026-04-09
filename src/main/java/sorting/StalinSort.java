package sorting;

import java.util.List;

/*
 * Se un elemento non e sorted viene rimosso.
 * 
 * Complessita: 0(n^2).
 */
public class StalinSort {
	public static List<Integer> sort(List<Integer> list) {
	    if (list.isEmpty()) return list;

	    int lastKept = list.get(0);

	    for (int i = 1; i < list.size(); ) {
	        if (list.get(i) >= lastKept) {
	            lastKept = list.get(i);
	            i++; 
	        } else {
	            list.remove(i); 
	        }
	    }

	    return list;
	}
}
