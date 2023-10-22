public class reverse_A_String {
    



  public static void main (String[]args)
  {



// 3 different ways to reverse a String 

// Logic 1  >>> using "+" (String concatenation) operator

/*
String str= "abcd";
String rev="";

for(int i=str.length()-1;i>=0;i--){
    rev=rev+str.charAt(i);
}

System.out.println(rev);
 */






//  Logic 2 >>> using character array

/* 
String str= "abcd";

char a[]=str.toCharArray();
for(int i=str.length()-1;i>=0;i--){
    System.out.print(a[i]);
}
*/






// Logic 3  >>> using StringBuffer class

    String str = "abcd";

    StringBuffer sb = new StringBuffer (str);
      sb.reverse ();
      System.out.println (sb);











  }
}

