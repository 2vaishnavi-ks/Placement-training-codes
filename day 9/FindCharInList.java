import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindCharInList {
    public static void main(String[] args) {
        //List<Integer> list = new ArrayList<>();
        // String[] words = {"leet", "code"};
        // char x = 'e';
        String[] words = {"abc", "bcd", "aaaaa", "cbc"};
        char x = 'a';

        // for(int index= 0; index<words.length; index++){
        //     if(words[index].contains(String.valueOf(x)))
        //         list.add(index);
        // }
        // System.out.println(list);

        List<Integer> collected = IntStream.range(0, words.length).filter(index->words[index].indexOf(x) != -1).
        boxed().collect(Collectors.toList());
        System.out.println(collected);
    }
}
