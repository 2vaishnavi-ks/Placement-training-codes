import java.util.Arrays;

public class MaxAndMin {
    public static int[] maxMin(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] num = new int[2];
        for(int i =0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }   
        }
        num[0] = max;
        num[1] = min;
        return num;
    }
    public static void main(String[] args) {
        int[] arr = {12,7,23,9,4,1,89,4};
        int[] result = maxMin(arr);
        System.out.println(Arrays.toString(result));
    }
}
