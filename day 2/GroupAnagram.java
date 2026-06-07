import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] inp = {"eat","bat","nat","tan","ate","ant"};
        //String[] inp = {"mat","tam","nat","tan","an"};
        //String[] inp = {"a"};
        Hashtable<String, ArrayList<String>> tab = new Hashtable<>();
        for(String each:inp){
            char[] value = each.toCharArray();
            Arrays.sort(value); // every anagram produces the same sorted value
            String key = new String(value);
            tab.putIfAbsent(key, new ArrayList<>()); // if the key is not present, create a new ArrayList
            tab.get(key).add(each);
        }
        System.out.println(tab.values());
    }
}
