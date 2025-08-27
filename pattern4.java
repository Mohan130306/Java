import java.util.Scanner;

public class pattern4 {
    public static void main(String[]arg){
        Scanner in = new Scanner (System.in);

        int n = in.nextInt();

        for(int row =1;row<=n;row++){
            for(int col=1;col<=n;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
