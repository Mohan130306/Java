import java.util.Scanner;

public class pattern2 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        int range = in.nextInt();

        for(int row = 1;row <= range;row++){
            for(int col = row; col>0;col--){
                System.out.print("*");
            }
            System.out.println();
        }
        in.close();
    }
}
