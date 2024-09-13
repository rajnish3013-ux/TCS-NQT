
//Program to find smallest element of an array

import java.util.*;
public class smallNumArray{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] arr = {19,34,23,6,12,56,10};

        int min = Integer.MAX_VALUE;

        for(int i=1; i<=arr.length-1; i++){

            if(arr[i]<min){

                min = arr[i];
            }
        }

        System.out.println(min);
    }
}