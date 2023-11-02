package JavaQuestions;
import java.util.*;



public class Sum_of_Elements_in_an_Array {

    public static int[] TakeArray(int arraySize){
        Scanner sc=new Scanner(System.in);
        int []arry=new int[arraySize];
        for(int i=0;i<arry.length;i++){
            arry[i]=sc.nextInt();
        }
        return arry;
    
    }

    public static void PrintArraySum(int Array_Size){
        int [] jay=TakeArray(Array_Size);
        int sum=0;
        for(int i=0;i<jay.length;i++){
            sum = sum+jay[i];
        }
        System.out.println(sum);
        
    }
    public static void main(String[] args) {
        // Sum of elements in an array
        // int arr[]={1,2,3,4,5};
        PrintArraySum(5);
        
        
        
    }
}
