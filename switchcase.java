import java.util.*;

public class switchcase{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        int choice = in.nextInt();

        switch(choice){
            case 1 : System.out.println("withdraw"); break;
            case 2 : System.out.println("deposit"); break;
            case 3 : System.out.println("Balance check"); break;
            default : System.out.println("Thankyou please enter in the range of 1-3");       
        }
        in.close();
    }
}
