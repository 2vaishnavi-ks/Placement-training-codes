import java.util.Arrays;

public class Maximum{
    public static int findLength(int[] arr){
        int size = arr.length, mLength = 1;
        int[] dp = new int[size];
        Arrays.fill(dp, 1);
        for(int index = 1; index<size; index++){
            for(int compute = 0; compute<index; compute++){
                if(arr[index]>arr[compute])
                    dp[index] = Math.max(dp[index], dp[compute]+1);
            }
        } 
        return mLength;
    }
    public static void main(String[] args) {
        int[] imp = {0,1,0,3,2,3};
        System.out.println(findLength(imp));
    }
}
