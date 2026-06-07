import java.util.Arrays;

public class nonOverlapping {
    public static int nonOverlap(int[][] nums){
        int count =0, pEnd = nums[0][1];
        if(nums.length == 0) return 0;
        Arrays.sort(nums,(row1, row2)->row1[1]-row2[1]); 
        //sorting of array based on the 1st row so tht the condition below gives the count
        //time complexity is O(n)

        for(int index = 1; index<nums.length; index++){
            if(nums[index][0]<pEnd)
                count++;
            else
                pEnd=nums[index][1];
        }
        return count;
    }
    public static void main(String[] args) {
        //int[][] slots = {{1,2},{2,3},{3,4},{2,3}};
        int[][] slots = {{1,2},{1,2},{1,2},{1,2}};    
        System.out.println(nonOverlap(slots));
    }
}
