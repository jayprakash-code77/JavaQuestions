package JavaQuestions;

public class minimum_and_maxmum_element_of_array {
    public static void main(String[] args) {
        int [] b={2,4,3,7,98,45,34};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<b.length;i++){
            if(b[i]<min){
                min=b[i];
            }
            if(b[i]>max){
                max=b[i];
            }
        }
        System.out.println("Maximum value :- "+max);
        System.out.println("Minimum value :- "+min);


    }
}
