import java.util.*;

public class posnev {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (number>0){
            System.out.println(number+" is positive number");
        }
        else if(number<0){
            System.out.println(number+" is negative number");
        }
        else{
            System.out.println(number+" is zero");
        }
        in.close();
    }
}
