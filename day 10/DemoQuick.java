import java.util.Arrays;

public class DemoQuick{
    public static int findPivot(int[] arr, int start, int end){
        int init =start-1, pData = arr[end];
        for(int trv=start; trv<end; trv++){
            if(arr[trv]>pData){ // change this condition to sort the array in asec or desc
                init++;
                int third = arr[init];
                arr[init] = arr[trv];
                arr[trv] = third;
            }
        }
        int third = arr[init+1];
        arr[init+1] = arr[end];
        arr[end] = third;
        return init+1;
    }
    public static void split(int[] arr, int start, int end){
        if(start<end){
            int pIndex = findPivot(arr, start, end);
            split(arr, start, pIndex-1);
            split(arr, pIndex+1, end);
        }
    }
    public static void main(String[] args) {
        int[] arr = {90, 34, 88, 1, 0, 23, 67, 3};
        //{4, 2, 7, 13, 45};
        split(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}