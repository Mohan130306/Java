import java.util.*;

public class testloopfor {
    public static void main(String [] args){
        Scanner in = new Scanner (System.in);

        int range = in.nextInt();
        //from 1 to N
        for(int start = 1; start<=range ; start++){
            System.out.print(start+" ");
        }
        //from N to 1
        for(int start = range; start>=1 ; start--){
            System.out.print(start+" ");
        }        
        in.close();
    }
}
