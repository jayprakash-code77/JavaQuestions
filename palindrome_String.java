

public class palindrome_String
{
  public static void main (String[]args)
  {



    // Palindrome_String

    String str = "MADAM";
    String ori_str = str;
    String rev = "";
    for (int i = str.length () - 1; i >= 0; i--)
      {
	rev = rev + str.charAt (i);
      }

    if (rev.equals (ori_str))
      {				// To check equality of String use  "str1.equal(str2);" method;
	System.out.println (ori_str + " is a Palindrome String.");
      }
    else
      {
	System.out.println (ori_str + " is Not a Palindrome String.");
      }






  }
}
