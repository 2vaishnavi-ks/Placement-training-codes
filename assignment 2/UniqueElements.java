import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueElements {
    public static int[] uniEle(int[] arr){
        List<Integer> list = new ArrayList<>();
        for(int value : arr){
            if(!list.contains(value))
                list.add(value);
        }
        int[] uniqueArr = list.stream().mapToInt(Integer::intValue).toArray();
        return uniqueArr;
    } 
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,4,4,5,6,6,6,7,8,8,8,8,9,10};
        System.out.println("The elements before : "+Arrays.toString(arr));
        int[] uniqueArr = uniEle(arr);
        System.out.println("Unique elements are : "+Arrays.toString(uniqueArr));
    }
}
