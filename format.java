import java.io.*;
import java.util.*;

public class format {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("================================");
        
        for (int i=0;i<3;i++){
            String s = in.next();
            int m = in.nextInt();
            System.out.printf("%-15s%03d%n",s,m);
        } 

        System.out.println("================================");
    }
}
