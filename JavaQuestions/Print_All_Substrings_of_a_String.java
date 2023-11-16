package JavaQuestions;

public class Print_All_Substrings_of_a_String {
    public static void main(String[] args) {
        
        String str="abc";

        for(int i=0;i<str.length();i++){
            String ans=""+str.charAt(i);
            System.out.println(ans);
            for(int j=i+1;j<str.length();j++){
                ans=ans+str.charAt(j);
                System.out.println(ans);
            }
            
        }
    }
}
