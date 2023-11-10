package JavaQuestions;

public class Remove_junk_or_Special_charactors {
    public static void main(String[] args) {
        String s="#*)&%$&)(&)(^&^*()) jay  *&*^* prakash ^*^$#$& maurya";
        s=s.replaceAll("[^ a-zA-Z0-9]", "");  // this is the important thing in this type of questions.
        System.out.println(s);
    }
}
