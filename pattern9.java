import java.util.Scanner;

public class pattern9 {
    public static void main(String[]args){
        Scanner in = new Scanner (System.in);

        int n = in.nextInt();

        for (int row = 1;row<=n;row++){
            //for printing spaces
            for (int col = row; col <n;col++ ){
                System.out.print(" ");
            }
            //for printing col numbers 
            for (int col = 1; col <= row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
        in.close();
    }
}
