import java.util.*;
class is_Prime_Or_Not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        if(n>1 ){
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(n+" is Prime.");
            }else{
                System.out.println(n+" is Not Prime.");
            }
        }else{
            System.out.println(n+" is Prime");
        }
    }
}