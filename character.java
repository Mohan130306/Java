import java.util.Scanner;

public class character {
    public static void main(String [] args){
        Scanner in = new Scanner (System.in);
        char value = in.next().charAt(0);

        for( char range = value ; range <= 'Z'; range++){
            System.out.print(range+" ");

        }
        in.close();
    }
}
