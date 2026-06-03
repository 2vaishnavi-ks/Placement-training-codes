import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] alpha = {1, 6, 5, 0,0 ,0};
        int m = 3, n=2;
        
        int[] beta = {2,5};
        int left =0, right = n-1, pos = m+n-1;
        while(left>=0 && right>=0){
            if(alpha[left]>beta[left=1])
                alpha[pos--]= alpha[right - 1];
            else
                alpha[pos--] = beta[right--];
        }
        while(right>= 0) alpha[pos--] = beta[right--];
        System.out.println(Arrays.toString(alpha));
        
    }
}
