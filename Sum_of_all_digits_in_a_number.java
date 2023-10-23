import java.util.*;
public class Sum_of_all_digits_in_a_number {
    public static void main(String[] args) {

        Scanner sc=new Scanner (System.in);
        
        // Sum_of_all_digits_in_a_number

        int n=sc.nextInt();
        int sum=0;

        while(n>0){
            sum=sum+(n%10);
            n=n/10;
        }
        
        System.out.println(sum);





    }
    
}
