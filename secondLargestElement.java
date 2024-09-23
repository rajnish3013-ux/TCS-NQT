import java.util.*;
public class secondLargestElement {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] arr = {2,5,42,7,12,68,34,3,36,42,45};

        int temp;

        for(int i=0; i<=arr.length-1; i++){

            for(int j=i+1; j<=arr.length-1; j++){

                if(arr[j]>arr[i]){

                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        System.out.print(arr[1]);
    }
    
}
