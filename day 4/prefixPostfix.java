import java.util.Arrays;

public class prefixPostfix {
    public static void pre(int[] prefix, int[] org, int index){
        if(index ==0){
            prefix[0]=org[0];
            return;
        }
        pre(org, prefix, index-1);
        prefix[index] = prefix[index-1]+org[index];
    }
    public static void post(int[] org, int[] postfix, int index) {
        if(index == org.length - 1){
            postfix[index] = org[index];
            return;
        }
        post(org, postfix, index+1);
        postfix[index] = postfix[index+1] +org[index];
        
    }
    public static void main(String[] args) {
        int[] arr = {23,12,98,45,18,45,12,98};
        int[] sumPre = new int[arr.length];
        int[] sumPost = new int[arr.length];
        pre(arr, sumPre, arr.length-1);
        System.out.println("Prefix Sum : ");
        System.out.println(Arrays.toString(sumPre));
        post(arr, sumPost, 0);
        System.out.println("postfix sum : ");
        System.out.println(Arrays.toString(sumPost));

    }

}
