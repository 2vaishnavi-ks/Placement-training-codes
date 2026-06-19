import java.util.Arrays;

public class ReverseElement{
    public static int[] reverse(int[] arr){
        int n = arr.length;
        int k=0;
        int[] num = new int[n];
        for(int i = n-1; i>=0; i--){
            num[k++] = arr[i];
        }
        return num;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int nums[] = reverse(arr);
        System.out.println(Arrays.toString(nums));
    }
}