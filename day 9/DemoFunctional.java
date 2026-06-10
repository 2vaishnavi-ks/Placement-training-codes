interface Cosmo{
    void printFrizz();
}
public class DemoFunctional {
    static int[] arr = {12,15,16,20, 4,8,9,10};
    public static void main(String[] args) {
        Cosmo cosmo = () ->{
            for(int each : arr)
                if(each%3 == 0 && each%5 !=0)
                    System.out.println("Fizz");
                else
                    System.out.println(each);
        };
        cosmo.printFrizz();
    }
}
