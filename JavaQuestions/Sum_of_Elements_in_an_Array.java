package JavaQuestions;
import java.util.*;



public class Sum_of_Elements_in_an_Array {

    // Function that takes array as input 
    public static int[] TakeArray(int arraySize){
        Scanner sc=new Scanner(System.in);
        int []arry=new int[arraySize];
        for(int i=0;i<arry.length;i++){
            arry[i]=sc.nextInt();
        }
        return arry;
    
    }
//   Function that print the sum of array
    public static void PrintArraySum(int Array_Size){
        int [] jay=TakeArray(Array_Size);
        int sum=0;
        for(int i=0;i<jay.length;i++){
            sum = sum+jay[i];
        }
        System.out.println(sum);
        
    }
    public static void main(String[] args) {
        PrintArraySum(5);
    }
}
