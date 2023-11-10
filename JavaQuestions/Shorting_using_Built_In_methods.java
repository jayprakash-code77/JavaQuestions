package JavaQuestions;
import java.util.Arrays;
import java.util.Collections;

public class Shorting_using_Built_In_methods {
    public static void main(String[] args) {

        // Approach 1  (assending order shorting )

        /*
        int [] arr={3,4,1,6,-6,-1000};
        System.out.println("Array elements before shorting "+ Arrays.toString(arr));
        Arrays.parallelSort(arr);  // shorting using built in method
        System.out.println("Array elements after shorting "+ Arrays.toString(arr));
        */


        // Approach 2 (assending order shorting )

        /*
        int[] arr={3,1,9,45,0,-7};
        System.out.println("Array elements before shorting "+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Array elements after shorting "+ Arrays.toString(arr));
        */




        // Approach 3 (Desending order)

        Integer[] arr={3,1,9,45,0,-7};   // we will make this array as non primitive
        System.out.println("Array elements before shorting "+ Arrays.toString(arr));
        Arrays.sort(arr, Collections.reverseOrder());  // this "Collection.reverse()" will support only for Non primitives
        System.out.println("Array elements after shorting "+ Arrays.toString(arr));

        
        

        
    }
}
