package Recursion;

import javax.naming.spi.DirStateFactory.Result;

public class Calculate_Power {


public static int Pow(int Base, int Power,int Result){
    if(Power==1){
        return Result;
    }
    return Base * Pow(Base, Power-1,Result*Base);
}
    public static void main(String[] args) {
        System.out.println("The power calculated is :-");
       int ans= Pow(3, 2,1);
       System.out.println(ans);
    }
}
