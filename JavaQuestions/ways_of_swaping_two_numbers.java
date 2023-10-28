package JavaQuestions;
public class ways_of_swaping_two_numbers {
    public static void main(String[] args) {
        




        int a=10;
        int b=20;
    
    // ways_of_swaping_two_numbers 
    
    // Logic 1 >>> Third variable
    /*
    int t=a;  // third variable
    a=b;
    b=t;
    System.out.print("a = "+a+", b = "+b);
     */
    
    
    //  Logic 2 >>> Using "+" and "-" without third variable
    /*
    a=a+b;  // 10+20=30
    b=a-b;  // 30-20=10
    a=a-b;  // 30-10=20
    System.out.print("a = "+a+", b = "+b);
     */
    
    
    //  Logic 3 >>> Using "*"  and "/" without using third variable. (Note:- Both number should be greater than 0)
    
    /*
    a=a*b;  // 10*20=200
    b=a/b;  // 200/20=10
    a=a/b;  // 200/10=20
    System.out.print("a = "+a+", b = "+b);
     */
    
    
    
    //  Logic 4 >>> Using bitwise XOR(^)
    // b=20= 010100(binary)
    // a=10= 01010(binary)
    /* 
    a=a^b;  // a^b=01010 ^ 10100 = 11110=30
    b=a^b;  // a^b=11110 ^ 10100 = 01010=10
    a=a^b;  // a^b=11110 ^ 01010 = 10100=20
    System.out.print("a = "+a+", b = "+b);
    */
    
    
    
    // Logic 5 >>>  using Single Statement 
    
    b=a+b-(a=b);  // b=10+20-(20)=30-20=10;
    System.out.print("a = "+a+", b = "+b);

    
    
    
    }
}
