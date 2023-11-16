package JavaQuestions;

public class Count_number_of_Occurence_of_a_charactor {
    public static void main(String[] args) {
        
        String s="jay Prakash Maury";
        int totalcount=s.length();
        int TotalAfterREmve=s.replace("a", "").length();
        int count=totalcount-TotalAfterREmve;
        System.out.println("NUmber occurence of a is "+count);
    }
}
