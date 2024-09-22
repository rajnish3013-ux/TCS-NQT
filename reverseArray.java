// import java.util.*;
// public class reverseArray {

//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int[] arr = {1,2,3,4,5,6,7,8};

//         for(int i=arr.length-1; i>=0; i--){

//             System.out.print(arr[i]+" ");

//         }
//     }
    
// }

import java.util.*;
public class reverseArray{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int temp;

        for(int i=0; i<=arr.length-1; i++){

            for(int j=arr.length-1; j>i; j--){

                while(arr[i]<arr[j]){

                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }


            }
        }

        for(int i=0; i<=arr.length-1; i++){

            System.out.print(arr[i]+" ");
        }
    }
}
