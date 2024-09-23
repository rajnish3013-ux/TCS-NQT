
// Program to Print second Smallest element of an array
import java.util.*;
public class secondSmallElement {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] arr = {4,23,12,45,56,43,76,3};
        int temp;
        for(int i=0; i<=arr.length-1; i++){

            for(int j=i+1; j<=arr.length-1; j++){

                if(arr[j]<arr[i]){

                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;

                }

            }
        }

        System.out.print(arr[1]);
    }
    
}
