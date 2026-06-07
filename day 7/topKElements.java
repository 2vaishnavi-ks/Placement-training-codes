import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
//not getting the right output

public class topKElements {
    public static void findFreq(int[] nums, int k){
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer,Integer>> pq = 
        new PriorityQueue<>((a,b)->a.getValue()-b.getValue()); // arrage the entry in incremental order with the value and not the key

        for(int each : nums)
            map.put(each, map.getOrDefault(pq, 0)+1); //this keeps a track of number of key
        
        for(Map.Entry<Integer, Integer> each : map.entrySet()){ //used to store the entry (key-value pair) into priority queue
            pq.offer(each);
            if(pq.size()>k) pq.poll(); //checks if the size of the queue exceeds 'k'value, if it does then, remove the least used value
        }

        int[] arr = new int[k];
        for(int index = 0; index<k; index++){
            arr[index] = pq.poll().getKey(); // removes the key from the queue
        }
        System.out.println(Arrays.toString(arr));
        
    }
    public static void main(String[] args) {
        //int arr[] = {1,2,1,2,1,3,1,3,2};
        int arr[] = {1,1,1,2,2,3};
        int k =2;
        findFreq(arr, k);
    }
}
