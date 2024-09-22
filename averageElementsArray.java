
//Average of elements of given array.

import java.util.*;
public class averageElementsArray {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int sum = 0;

        int[] arr = {1,2,3,4,5,6,7};

        for(int i=0; i<=arr.length-1; i++){

            sum = sum+arr[i];
        }

        int average = sum/arr.length;

        
        System.out.println("Sum of elements of given array: "+sum);
        System.out.println("Average of elements of given array: "+average);
        System.out.print("Length of given array: "+arr.length);
        
    }
    
}
