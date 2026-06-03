public class patterns {
    public static void sandClock(String name){
        int size = name.length(),row;
    for(row = size-1; row>=0; row--){
        System.out.println(" ");
            for(int space = 0; space<size-row-1; space++)
                    System.out.println(" ");

        }
    }
    public static void main(String[] args) {

        /*right-angled triangle
        String name = "Sita";
        int row =0, col = 0, size =name.length();
        for(row = 0; row<size; row++){
            for(col=0; col<=row;col++){
                System.out.print(name.charAt(col));
            }
            System.out.println();
        }*/

        /*String name = "Sita";
        int row =0, col = 0, size =name.length();
        for(row = 0; row<size; row++){
            for(int space= size-row-1; space>=0; space--){
                System.out.print(" ");
            }
            for(col=0; col<=row;col++){
                System.out.print(" "+name.charAt(col));
            }
            System.out.println();
        }*/

        String name = "Sita";
        int row =0, col = 0, size =name.length();
        for(row = 0; row<size; row++){
            for(int space= size-row-1; space>=0; space--){
                System.out.print(" ");
            }
            for(col=0; col<=row;col++){
                System.out.print(" "+name.charAt(col));
            }
            System.out.println();
        }

    }
}
