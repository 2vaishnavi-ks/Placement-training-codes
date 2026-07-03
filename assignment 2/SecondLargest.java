public class SecondLargest {
    public static int largestNumber(int[] arr){
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++){
            if(arr[i] > firstMax){
                secondMax = firstMax;
                firstMax = arr[i];
            }
            else if (arr[i] > secondMax && firstMax > arr[i]){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        int[] arr = {8,2,4,1,9,33,5,23,0,15};
        System.out.println("Second largest element : "+largestNumber(arr));
    }
}
