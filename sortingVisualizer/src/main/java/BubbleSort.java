package src.main.java;

public class BubbleSort implements SortingAlgoritm{
    private SortingPanel sp;
    public BubbleSort(SortingPanel sp){
        this.sp = sp;
    }
    @Override
    public void runSort(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j + 1]){
                    sp.swap(j, j  + 1, 2);
                }
            }
        }
    }
}
