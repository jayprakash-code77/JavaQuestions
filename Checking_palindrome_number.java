public class Checking_palindrome_number {
    
    public static void main(String[] args) {
        



	// Checking_palindrome_number


int n=12321;
int ori_num=n;

int rev=0;
while(n!=0){
    rev=rev*10 + n%10;
    n=n/10;
}
if(rev==ori_num){
    System.out.println(ori_num+" is a Palindrome Number.");
}else{
    System.out.println(ori_num+" is Not a Palindrome Number.");
}

	

    }
}
