import java.util.Arrays;

public class CopyNumbers {
    public static void copy(int[] arr){
        int n = arr.length;
        int[] copyArr = new int[n];

        for(int i = 0; i<n; i++){
            copyArr[i] = arr[i];
        }

        System.out.println("The elements copied to the new array is : "+Arrays.toString(copyArr));
        //in-built function : Arrays.copyOf(arr, arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {3,6,4,2,1,8,9,0,1,2,34,14,67};

        System.out.println("Original array is : "+Arrays.toString(arr));
        copy(arr);
    }
}
