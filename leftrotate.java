import java.util.*;

public class leftrotate{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int arr[] = new int[size];

        for(int index=0;index<size;index++){
            arr[index] = in.nextInt();
        }
        int leftrottimes = in.nextInt();

        for(int times =0;times<leftrottimes;times++){
            int temp = arr[0];
            for (int index =0;index<size-1;index++){
                arr[index]=arr[index+1];
                System.out.print(arr[index]+" ");
            }
            System.out.print(arr[size-1]= arr[0]);
            System.out.println();
        }

    }
}