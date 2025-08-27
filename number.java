import java.util.Scanner;

public class number {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        int range = in.nextInt();

        for(int row = 1;row <= range;row++){
            for(int col = row; col>0;col--){
                System.out.print(row+" ");
            }
            System.out.println();
        }
        for(int row = 1;row <= range;row++){
            for(int col = row; col>0;col--){
                System.out.print(col+" ");
            }
            System.out.println();
        }
        for(int row = 1 ; row <= range; row++){
            for (int col = row;col>0 ; col--){
                System.out.print(col+" ");
            }
            System.out.println();
        }
        in.close();
    }
}