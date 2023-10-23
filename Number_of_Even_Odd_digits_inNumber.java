import java.util.*;
public class Number_of_Even_Odd_digits_inNumber {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);
        
        int n=sc.nextInt();
        int even=0;
        int odd=0;

        while(n >0){

            if((n%10)%2==0){
                even++;
            }else {
                odd++;
            }
            n=n/10;
        }
        System.out.println(even +" even digits.");
        System.out.println(odd +" odd digits.");


    }
    
}
