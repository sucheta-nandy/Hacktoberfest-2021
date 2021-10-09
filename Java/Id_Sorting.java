import java.util.Arrays;

public class Id_Sorting {

    public static void main(String[] args) {

        int[] arr = {34, 02, 13, 25, 43, 12, 04, 21};
       
        intermediate_insertionsort(arr);
                 System.out.println("\n Sorted array in ascending order by green numbers (second digit)  = "+ Arrays.toString(arr));
       
                 final_insertionSort(arr);
                 System.out.println("\n Sorted array in ascending order by red numbers (first digit) = "+ Arrays.toString(arr));
    }

    static int[] intermediate_insertionsort(int[] arr){

        int[] Array;
        
        for(int i=1; i< arr.length;i++){
            int key = arr[i];
            int j = i-1;

            while (j>=0 && (key%10)<(arr[j]%10)) {
                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1]=key;
        }

        Array = arr;
        return Array;
    }

    static void final_insertionSort(int[] arr){

        int[] Array = intermediate_insertionsort(arr);
         for(int i=1; i< Array.length;i++) {
            int key = Array[i];
            int j = i-1;

            while (j>=0 && key<Array[j]){
                Array[j+1] = Array[j];
                --j;
            }

            Array[j+1]=key;
        }
    }
}