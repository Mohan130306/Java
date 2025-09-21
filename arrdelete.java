import java.util.*;

public class arrdelete {
    public static void main(String [] args){
        Scanner in = new Scanner (System.in);

        int size = in.nextInt();
        int arr[] = new int[size];

        for (int index=0;index<size;index++){
            arr[index] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int ind = in.nextInt();
        for(int index=0;index<size;index++){
            if(ind>arr[index]){
                arr[index]=arr[index+1];
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
