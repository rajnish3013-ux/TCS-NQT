
import java.util.*;
public class largNumArray {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] arr = {54,56,34,23,67,45,23};

        int max = Integer.MIN_VALUE;

        for(int i=1; i<=arr.length-1; i++){

            if(arr[i]>max){

                max = arr[i];
            }
        }

        System.out.print(max);
    }
    
}
