package JavaQuestions;

public class Binary_Search_algorithm {
    public static void main(String[] args) {
        // int e[]={2,4,56,67,79,80}; // shorted array
        int e[]={80,79,67,56,4,2};  // shorted array
        int start=0;
        int end=e.length-1;
        int mid=(start+end)/2;
        int key=4;

        while(start<=end){
            // print the value and return
            if(e[mid]==key){
                System.out.println("Element found at index "+mid);
                return;
            }
            // decide in which part of array do we have to go, left or right.
            if(e[mid]<key){   // this will change for accending and decending orders.
                end=mid-1;
            }else{
                start=mid+1;
            }
            // update mid            //  
            mid=(start+end)/2;
        }
        // print '-1' if the element does not exists;
        System.out.println(-1);
    }
}
