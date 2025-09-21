import java.util.*;

public class arrayinsert {
    public static void main(String [] args){
        Scanner in = new Scanner (System.in);

        int size = in.nextInt();
        int arr[] = new int[size+1];

        for (int index=0;index<size;index++){
            arr[index] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int position = in.nextInt();
        int value = in.nextInt();

        for (int index=size-1;index>=position-1;index--){
            arr[index+1]=arr[index];
        }
        arr[position-1]=value;
        System.out.print(Arrays.toString(arr));
    }
}
