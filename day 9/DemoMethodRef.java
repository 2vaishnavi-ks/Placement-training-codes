import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//methds reference way 
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

public class DemoMethodRef {
    public static void main(String[] args) {
        List<String> skills = Arrays.asList("Spring", "Django", "Cypress", "Jinja", "NUnit", "active MQ");
        System.out.println(skills);
        skills.forEach(skills -> System.out.println(skills));
        
        skills.sort(String::compareTo);
        skills.forEach(System.out::println);
        pojoRefer();
        
    }
    public static void pojoRefer(){
        List<Product> items = Arrays.asList(
            new Product("SSD", 56000),
            new Product ("Pen-deice", 800)
        );
        items.forEach(System.out::println);
        items.sort(Comparator.comparing(Product :: getItemName);
        items.forEach(System.out::println);
    )
    }
    
}
