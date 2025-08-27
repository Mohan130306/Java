import java.util.Scanner;

public class pattern1 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);

        int range = in.nextInt();

        for(int row = 0 ; row < range; row++){
            for (int col = 0;col< range ; col++){
                System.out.print("*");
            }
            System.out.println();
        }
        in.close();
    }
}
