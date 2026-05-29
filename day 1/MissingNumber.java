import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingNumber {
    // public static isExists(int[] inv, int current){
    //do the regular ones with user defined functions 
    // }
    public static void main(String[] args) {
        //List<Integer> invoices = Arrays.asList(8,10,3,1,4,2,5);
        List<Integer> invoices = Arrays.asList(45,91,90,92,46);
        int mini = Collections.min(invoices);
        while(true){
            int current = mini+1;
            if(invoices.contains(current))
                mini = current;
            else{
                System.out.println("Missing minimum "+current);
                return;
            }
        }
    }
}
