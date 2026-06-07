import java.util.Hashtable;

public class slidingWindowMini {
    public static String[] window(String[] c, String[] r){
        Hashtable<String, Integer> rtab = new Hashtable<>();
        Hashtable<String, Integer> ctab = new Hashtable<>();
        int mStart =0, start =0, end=0, mLen =Integer.MAX_VALUE;
        int count =0;
        for(String each : r)
            rtab.put(each, rtab.getOrDefault(each, 0)+1);

        while(end<c.length){
            ctab.put(c[end], rtab.getOrDefault(c[end], 0)+1);
            if(rtab.containsKey(c[end])) count++;
            while(count == rtab.size()){
                if(mLen>(end-start-1)){
                    mLen=end-start+1;
                    mStart = start;
                }
                String exists;
            }
        }
    }
}
