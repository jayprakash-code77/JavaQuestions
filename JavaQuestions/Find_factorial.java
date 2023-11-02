package JavaQuestions;
import java.util.*;

public class Find_factorial {
  public static void main(String[] args) {
    // Find factorial of a number
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=1;
    while(n>0){
        sum =sum*n;
        n--;
    }
    System.out.print(sum);
    sc.close();
  }
}
