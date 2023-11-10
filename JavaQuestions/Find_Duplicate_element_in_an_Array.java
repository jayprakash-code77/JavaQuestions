package JavaQuestions;

public class Find_Duplicate_element_in_an_Array {
    public static void main(String[] args) {
        int [] c={1,2,3,5,9,3,5};
        System.out.print("The duplicate numbers are :- ");
        for(int i=0;i<c.length;i++){
            for(int j=i+1;j<c.length;j++){
                if(c[i]==c[j]){
                    System.out.print(c[i]+" ");
                }
            }
        }
    }
}

