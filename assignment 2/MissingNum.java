public class MissingNum{
    public static int number(int[] arr, int n){
        int totalSum = n*(n+1)/2;
        int arrSum = 0;
        for(int i =0; i<arr.length; i++){
            arrSum+=arr[i];
        }
        return totalSum-arrSum;
    }
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,7,8};
        System.out.println("The missing number is : "+number(num, 8));
    }
}