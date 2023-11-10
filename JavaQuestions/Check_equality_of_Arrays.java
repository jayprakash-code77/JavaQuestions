package JavaQuestions;
import java.util.Arrays;
public class Check_equality_of_Arrays {
    public static void main(String[] args) {
        // 1st way to check weather the arrays are equal or not using 'Arrays class method called =>  equals()'.
        /* 
        int a1[]={1,2,3,4,5};
        int a2[]={1,2,3,4,5};
        boolean checkIf_Array=Arrays.equals(a1,a2);
        System.out.println(checkIf_Array);
        if(checkIf_Array){
            System.out.println("Arrays are equal.");
        }else {
            System.out.println("Arrays are not equal.");
        }
        */

        // 2nd way to check weather the arrays are equal or not using logic.

        int a1[]={1,2,3,4,5};
        int a2[]={1,2,3,4,5,6};
        boolean check=true;
        for(int i=0;i<a1.length;i++){
            if(a1[i] != a2[i]){
                check=false;
                break;
            }
        }
        if(check && (a1.length==a2.length)){
            System.out.println("Arrays are equal.");
        }else{
            System.out.println("Array are not equal.");
        }


        
    }
}
