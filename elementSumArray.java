import java.util.*;
public class elementSumArray {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int sum = 0; 
        int[] arr = {1,2,3,4,5,6,7};

        for(int i=0; i<=arr.length-1; i++){

            sum = sum+arr[i];

        }

        System.out.print(sum);
    }
    
}
