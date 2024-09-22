import java.util.*;
public class increasingDecreasingArray {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] arr = {4,2,6,3,5,1};

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

        for(int i=0; i<=arr.length-1; i++){

            System.out.print(arr[i]);
        }

    }
    
}
