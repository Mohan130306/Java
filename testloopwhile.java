import java.util.Scanner;

public class testloopwhile {
    public static void main(String [] args){
        Scanner in = new Scanner (System.in);

        int range = in.nextInt();

        while(range>=1){
            System.out.print(range);
            range--;
        }
        in.close();
    }
}
