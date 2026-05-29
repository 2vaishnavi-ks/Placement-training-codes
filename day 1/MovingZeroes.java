import java.util.*;
public class MovingZeroes {
    public static void move(int[] trucks) {
        int valid = 0, traversal = 1, size = trucks.length;
        while(traversal<size){
            if(trucks[traversal] != 0){
                trucks[valid] = trucks[traversal];
                valid++;
            }
            traversal++;
        }
        Arrays.fill(trucks, valid, size, 0);
        System.out.println(Arrays.toString(trucks));

        /*int k =0;
        for(int i =0; i<trucks.length; i++){
            if(trucks[i] != 0){
                trucks[k++] = trucks[i];
            }
        }
        for(int i = k; i<trucks.length;i++){
            trucks[i] = 0;
        }
        System.out.println(Arrays.toString(trucks));*/
    }
    public static void main(String[] args) {
        move(new int[]{20,0,19,5,0,3,10,0,2});
        move(new int[]{0,1,0,3,12});
        move(new int[]{3,0,0,1,0,5,0,6,0});
    }
}
