package sorting;

/*
allora:
 - 1 scegli il pivot
 - 2 array viene diviso in 2 parti
 	- elementi minori a sinistra del pivot
 	- elementi maggiori a destra del pivot
 - 3 applicazione di pivot e divisione sulla parte sinistra

 notazione
 */
public class Quicksort {

	// partition function
	public static int partition(int[] arr, int low, int high) {

		// choose the pivot
		int pivot = arr[high];

		// index of smaller element and indicates
		// the right position of pivot found so far
		int i = low - 1;

		for (int j = low; j <= high - 1; j++) {
			if (arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}

		// Move pivot after smaller elements and
		// return its position
		swap(arr, i + 1, high);
		return i + 1;
	}

	// swap function
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	// the QuickSort function implementation
	public static void quickSort(int[] arr, int low, int high) {
		if (low < high) {

			int pi = partition(arr, low, high);

			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}

}
