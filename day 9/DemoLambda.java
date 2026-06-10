import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/*  
    List<Integer> list = List.of(34,65,12,1,98,22);
    List<Integer> list = Stream.of(34,65,12,1,98,22).toList();
    these two functions are immutable
*/

class Product{
    String itemName;
    int itemPrice;
    public Product(String string, int i) {
        //TODO Auto-generated constructor stub
    }
    @Override
    public String toString() {
        return itemName+" = "+itemPrice+" \n";
    }
}
public class DemoLambda{
    public static void pojoLambda(){
        Product p1 = new Product();
        p1.itemName = "HP Pavilion"; p1.itemPrice= 41000;
        Product p2 = new Product();
        p2.itemName = "Mac Book"; p2.itemPrice= 121000;
        Product p3 = new Product();
        p3.itemName = "Dell"; p3.itemPrice= 65000;

        List<Product> items = new ArrayList<>();
        items.add(p1); items.add(p2); items.add(p3);

        Collections.sort(items, (o1, o2)-> o1.itemPrice - o2.itemPrice);
        System.out.println(items);
    }
    public static void main(String[] args) {
        List<Integer> alpha = new ArrayList<>();
        alpha.add(32);
        alpha.add(65);
        alpha.add(6);
        alpha.add(90);
        alpha.add(45);
        alpha.add(87);

        System.out.println(alpha);

        //collections without lambda functions
        // Collections.sort(alpha);
        // Collections.sort(alpha, new Comparator()
        //     public int compare(Integer i1, Integer i2){
        //         return i2-i1;
        //     }

        //     @Override
        //     public int compare(Object o1, Object o2) {
        //         // TODO Auto-generated method stub
        //         throw new UnsupportedOperationException("Unimplemented method 'compare'");
        //     }
        // );

        Collections.sort(alpha, (i1,i2)-> i2-i1); //sorting using lambda expression , which sorts in descending order
        System.out.println(alpha);
        pojoLambda(); // calls the list which stores object values and 
    }
}