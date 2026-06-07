import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class demoList {
    public static void main(String[] args) {
        LinkedList buffer = new LinkedList<>(); // non-generic, where the data typeis not mentioned, any data can be stored in the form of object
        buffer.add("Shila");
        buffer.add(56);
        buffer.add(false);
        buffer.add(9.5321);

        Queue<String> store = new PriorityQueue<>(); // generic , where the data type "String" is mentioned
        // Queue<String> store = new PriorityQueue<>((a,b)->b.comparteTo(a)); 
        //priority queue in default stores the values in ascending order, so if u need to retrieve the value according 
        //order in which it was inserted, then the above method shld be used
        store.offer("Spring Boot");
        store.offer("Django");
        store.offer("Java script");

        System.out.println(store);

        Iterator it = buffer.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
