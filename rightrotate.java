import java.util.*;

public class rightrotate {
    public static void main(String[]args){
        Scanner in = new Scanner (System.in);

        int size = in.nextInt();
        int arr[]=new int[size];

        for (int index = 0; index<size ;index++){
            arr[index]=in.nextInt();
        }

        int rightrottimes=in.nextInt();
        for(int times=0;times<rightrottimes;times++){
            int temp=arr[size-1];
            for (int index=size-1;index>0;index--){
                arr[index]=arr[index-1];
            }
            arr[0]=temp;
        }
        for (int index = 0; index<size ;index++){
                System.out.print(arr[index]+" ");
            }
    }
}
  