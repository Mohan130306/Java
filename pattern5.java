import java.util.Scanner;

public class pattern5 {
    public static void main(String [] args){
        Scanner in = new Scanner (System.in);

        int n = in.nextInt();

        for (int row=1; row<=n;row++){
            for (int col=row;col>0;col--){
                System.out.print(row+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
