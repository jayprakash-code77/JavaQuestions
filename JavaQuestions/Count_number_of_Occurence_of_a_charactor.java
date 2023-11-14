package JavaQuestions;

public class Remove_white_spaces_in_String {
    public static void main(String[] args) {
        
        String s="ay Prakash Maury";
        int totalcount=s.length();
        int TotalAfterREmve=s.replace("a", "").length();
        int count=totalcount-TotalAfterREmve;
        System.out.println("NUmber occurence of a is "+count);
    }
}
