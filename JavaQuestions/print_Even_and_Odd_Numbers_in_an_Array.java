package JavaQuestions;

import java.util.Scanner;

public class print_Even_and_Odd_Numbers_in_an_Array {

public static int [] inputArray(int ArraySize){
    Scanner sc=new Scanner(System.in);
    int arry []=new int[ArraySize];
    for(int i=0;i<ArraySize;i++){
        arry[i]=sc.nextInt();
    }
    return arry;
}
    public static void main(String[] args) {
        int ar[]=inputArray(6);
        // Even
        System.out.println("Even numbers in the array are ...");
        for(int i=0;i<ar.length;i++){
            if(ar[i]%2==0){
                System.out.println(ar[i]+" ");
            }
        }
        // Odd
        System.out.println("Odd numbers in the array are ...");
        for(int i=0;i<ar.length;i++){
            if(ar[i]%2!=0){
                System.out.println(ar[i]+" ");
            }
        }
        

    }
}
