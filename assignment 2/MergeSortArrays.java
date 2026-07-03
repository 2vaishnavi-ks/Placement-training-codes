import java.util.Arrays;

public class MergeSortArrays {
    public static int[] mergeArray(int[] arr1, int[] arr2){
        int i =0, j=0, k=0;
        
        int[] merged = new int[arr1.length + arr2.length];
        while(i < arr1.length && j< arr2.length){
            if(arr1[i] < arr2[j]){
                merged[k++] = arr1[i];
                i++;
            }
            else{
                merged[k++] = arr2[j];
                j++;
            }
        }
        while(i<arr1.length){
            merged[k++] = arr1[i++];
        }
        while(j<arr2.length){
            merged[k++] = arr2[j++];
        }
        return merged;
    }
    public static void main(String[] args) {
        int[] num1 = {1,3,5,7,9};
        int[] num2 = {2,4,6,8,10};
        int[] result = mergeArray(num1, num2);
        System.out.println("The merged array is : "+ Arrays.toString(result));

    }
}
