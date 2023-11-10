package JavaQuestions;

public class Find_missing_number_in_an_array {
    public static void main(String[] args) {
        // Array should not have duplicate values
        // Array may or may not be shorted
        // Values should be range 

        int a[]={1,2,4,5};  // value will start from 1 till end value n.
        // step 1 :- find sum of all values in the given array
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum +=a[i];
        }
        // First and last value
        int lastValue=a[a.length-1];
        int firstValue=a[0];
        // sum of all value in the range including missing value.
        int valueSum=0;
        for(int j=firstValue;j<=lastValue;j++){
            valueSum +=j;
        }
        // finding the missing value.
        System.out.println(valueSum-sum +" is a missing number.");

    }
}
