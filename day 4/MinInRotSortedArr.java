public class MinInRotSortedArr {
    public static void main(String[] args) {
        //int[] arr = {11,12,13,19};
        int[] arr = {9,4,8,0,1,3,2};
        int left = 0, right = arr.length-1;
        while(left<right){
            int mid = left+ (right-left)/2;
            if(arr[mid] > arr[right]) left = mid+1;
            else right = mid;
        }
        System.out.println(arr[left]);
    }
}
