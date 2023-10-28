package JavaQuestions;
import java.util.*;
public class generate_Fibonacci_series {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int N1=0;
        int N2=1;
        if(n==1){
            System.out.println(0);
        }else if(n==2){
            System.out.println(0);
            System.out.println(1);
        }else{
            System.out.println(0);
            System.out.println(1);
            for(int i=3;i<=n;i++){
                int fab=N1+N2;
                System.out.println(fab);
                N1=N2;
                N2=fab;
            }
        }
        sc.close();
    }
}
