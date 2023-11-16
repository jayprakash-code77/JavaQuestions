package JavaQuestions;

public class Count_words_in_a_String {
    public static void main(String[] args) {
        String str="Welcome to Java";
        int count=0;
        // First wayn (Not optimized)
        /* 
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
        System.out.println(count+1);
        */

        // Second way  (Little Optimized)
        
        int counting=1;
        for(int j=0;j<str.length();j++){
            if((str.charAt(j)==' ') && (str.charAt(j+1) !=' ')){
                counting++;
            }
        }
        System.out.println("Number of words in a String are "+counting);

    }
}
