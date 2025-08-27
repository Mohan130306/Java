import java.util.Scanner;

public class switchusingchar {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        char choice = in.next().charAt(0);

        switch(choice){
            case 'A' : System.out.println("withdraw"); break;
            case 'B' : System.out.println("deposit"); break;
            case 'C' : System.out.println("Balance check"); break;
            default : System.out.println("Thankyou please enter in the range of 1-3");
        }
        in.close();
    }
}
