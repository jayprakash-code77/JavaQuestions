package JavaQuestions;

public class Remove_white_spaces_in_a_String {
    public static void main(String[] args) {
        String str="Jay       Prakash Maurya";
        // str=str.replaceAll(" ", "");// first way
        str=str.replaceAll("\\s", "");
        System.out.println(str);

    }
}
