import java.util.*;

public class oddeven {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        if (value%2==0){
            System.out.println(value+" is an Even Number");
        }
        else{
            System.out.println(value+" is Odd Number");
        }
        in.close();
    }
}
