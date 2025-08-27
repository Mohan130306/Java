import java.util.Scanner;

public class pattern8 {
    public static void main(String [] args){
        Scanner in = new Scanner (System.in);

        int n = in.nextInt();

        for (int row = 1;row<=n;row++){
            //for printing spaces
            for (int col = row; col <n;col++ ){
                System.out.print(" ");
            }
            //for printing col numbers 
            for (int col = row; col >= 1;col--){
                System.out.print(row);
            }
            System.out.println();
        }
        in.close();
    }
}
