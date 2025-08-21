import java.io.*;
import java.util.*;

public class Scannerstr {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       
       int i = in.nextInt();
       double f = in.nextDouble();
       in.nextLine();
       String s = in.nextLine();
       
       System.out.println("String: " + s);
       System.out.println("Double: " + f);
       System.out.println("Int: " + i);
       
       in.close();
    }
}
