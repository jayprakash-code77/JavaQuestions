import java.util.*;
public class Largest_of_3_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        // This is a first approach of the problem
        // if(a>b && a>c){
        //     System.out.println(a+" is largest.");
        // }else if(b>a && b>c){
        //     System.out.println(b+" is largest.");
        // }else if(c>b && c>a){
        //     System.out.println(c+" is largest.");
        // }

        // This is the second approach of the problem
        // (Ternary operators)
        int largest=a>b ? a:b;  // ternary operator is used
        if(largest>c){
            System.out.println(largest+" is largest.");
        }else{
            System.out.println(c+" is greatest.");
        }

    }
}
