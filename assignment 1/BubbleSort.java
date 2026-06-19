import java.util.Arrays;

public class BubbleSort {
    // public static void swap(int a, int b){
    //     int temp = a;
    //     a = b; 
    //     b= temp;
    // }
    public static void sort(int[] arr){
        int n = arr.length;
        boolean swapped;
        for(int i =0; i<n-1; i++){
            swapped = false;
            for(int j = 0; j<n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    //swap(arr[j], arr[j+1]);
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }
    public static void main(String[] args) {
        int[] arr = {6,7,1,3,9,0,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
