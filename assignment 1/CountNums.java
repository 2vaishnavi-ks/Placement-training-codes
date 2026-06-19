import java.util.Arrays;

public class CountNums {
    public static int[] count(int[] arr){
        int countZero = 0, countPos = 0, countNeg = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > 0)
                countPos++;
            else if(arr[i]<0)
                countNeg++;
            else
                countZero++;
        }
        int[] result = new int[3];
        result[0] = countNeg;
        result[1] = countZero;
        result[2] = countPos;
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,0,-3,1, -8, -4, -2, 0, 0, -1};
        int[] res = count(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Negative numbers count : "+res[0]);
        System.out.println("Zero numbers count : "+res[1]);
        System.out.println("Positive numbers count : "+res[2]);
    }
}
