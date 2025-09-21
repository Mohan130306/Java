import java.util.*;

public class reversearr {
    public static void main(String[]args){
        Scanner in = new Scanner (System.in);

        int size = in.nextInt();
        int arr[]=new int[size];

        for (int index = 0; index<size ;index++){
            arr[index]=in.nextInt();
        }

        int start = 0;
        int end = size-1;
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end++;
        }
        for (int index = 0; index<size ;index++){
            System.out.print(arr[index]);
        }
    }
}
