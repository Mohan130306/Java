import java.util.Scanner;
public class years {
    public static void main(String[]args){
        Scanner in = new Scanner (System.in);
        int days = in.nextInt();

        int years = days/365;
        int remain = days%365;
        int month = remain/30;
        int remain_days = remain%30;

        System.out.println("Years: "+years);
        System.out.println("Months: "+month);
        System.out.println("Days: "+remain_days);

        in.close();
    }
}
