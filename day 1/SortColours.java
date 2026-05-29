import java.util.Arrays;

public class SortColours {
    public static void sort(int[] tickets) {
        int left =0, trav=0, end = tickets.length-1;
        while(trav<end){ //check for the condition, when it is trav<=end, the first test case fails. whereas this condition it passes
            if(tickets[trav] == 0){
                tickets[trav]^=tickets[left]; //using xor method, can use third variable method or arithematic operation
                tickets[left]^=tickets[trav];
                tickets[trav]^=tickets[left];
                left++;trav++;
            }
            else if(tickets[trav] == 1) trav++;
            else{
                tickets[trav]^=tickets[end];
                tickets[end]^=tickets[trav];
                tickets[trav]^=tickets[end];
                end--;
            }
        }
        System.out.println(Arrays.toString(tickets));
        
    }
    public static void main(String[] args) {
        sort(new int[]{1,2,0,0,1,2,0,0,2,1,0});
        sort(new int[]{2,2,2,1,0,1,0,0,1,2});
        
    }
}
