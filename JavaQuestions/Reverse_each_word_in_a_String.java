package JavaQuestions;

public class Reverse_each_word_in_a_String {
    public static void main(String[] args) {
        String str="Welcome to Java";  // Original String

        String[] words=str.split(" ");  // Spliting the String into words

        String reverseString="";  // Answer storing String

        for(String w:words){

            String reverseWord="";
            for(int i=w.length()-1;i>=0;i--){   // this will reverse each word
                reverseWord=reverseWord+w.charAt(i);
            }

            reverseString=reverseString+reverseWord+" "; // this will add all reversed words in the "recerseString";
        }

        System.out.println(reverseString);   // this will print the reversed string.
    }
}
