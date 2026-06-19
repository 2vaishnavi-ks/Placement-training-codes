import java.util.Arrays;

public class LinearSearch {
    public static int search(int[] arr, int num){
        for(int index = 0; index<arr.length; index++){
            if(arr[index] == num)
                return index;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,56,12,98,23,56,9,60};
        int result = search(arr, 9);
        System.out.println(Arrays.toString(arr));
        System.out.println("The element 9 is found in the index "+(result+1));
    }
}
