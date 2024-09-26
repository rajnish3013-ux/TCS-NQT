
// REmove Duplicate Elements from sorted Array

import java.util.*;
public class removeSortedDuplicate {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] arr = {1,2,2,3,4,5,5,6,6,7,7,8,8,9,9};

        int[] temp = new int[arr.length];

        int j = 0;

        for(int i=0; i<arr.length-1; i++){

            if(arr[i]!=arr[i+1]){

                temp[j] = arr[i];
                j++;
            }


        }

        temp[j] = arr[arr.length-1];

        for(int i=0; i<=arr.length-1; i++){

            System.out.print(temp[i]+" ");
        }

        
    }
    
}
