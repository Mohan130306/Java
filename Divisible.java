import java.util.Scanner;
public class Divisible {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        int number = in.nextInt();
        if (number%3==0 && number%5==0){
            System.out.println(number+" is divisible by 3 and 5");
        }
        else{
            System.out.println(number+" is not divisible by 3 and 5");
        }
        in.close();
    }
}
