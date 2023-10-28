package JavaQuestions;
public class different_ways_to_reverse_number {
    public static void main(String[] args) {
        



        // 3_different_ways_to_reverse_number_in_java

// Logic 1 >>> using  algorithm 

/* 
int n=1234;
int rev=0;
while(n!=0){
    rev=rev*10 + n%10;
    n=n/10;
}
System.out.println(rev);
*/



// Logic 2 > using  StringBuffer class
/* 
int n=1234;
StringBuffer sb=new StringBuffer(String.valueOf(n));  // converting number to string
StringBuffer rev=sb.reverse();

System.out.println(rev);
*/




// Logic 3 > Using StringBuilder class


int n=1234567;
StringBuilder sbuild=new StringBuilder();
sbuild.append(n);
StringBuilder rev=sbuild.reverse();

System.out.println(rev);
 

		
		
    }
}
