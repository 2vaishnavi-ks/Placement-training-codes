import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadEof{
    public static void main(String[] args) throws IOException{
        BufferedReader bIn = new BufferedReader(
            new InputStreamReader(System.in)
        );
        String eachLine = "";
        int lNo = 1;
        //while(eachLine = bIn.readLine()!=null) // for handling null values, can be used in hackerrank
        while(!(eachLine = bIn.readLine()).equals("EOF")){
            System.out.println(lNo+" "+eachLine);
            lNo++;
        }
        bIn.close();
    }
}