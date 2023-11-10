package JavaQuestions;

public class Merge_to_Shorted_Arrays {

    public static void printArray(int [] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String[] args) {
        // Two shorted arrays
        int []a1= {1,2};
        int []a2= {6,7,8};

        // Declaration of new result array
        int m=a1.length;
        int n=a2.length;
        int result[]= new int[m+n];

        // Initialization of i, j, k.
        int i=0; //for a1 array.
        int j=0; //for a2 array.
        int k=0; //for the result merge.
        
        // this loop will run n+m-1 times
        while(k<=(m+n-1)){
            // this loop will run m-1 times
            while(i<=m-1 && j<=n-1){
                if(a1[i]>a2[j]){  // this will run if element of a1 array is bigger than element of a2 array.
                    result[k]=a2[j];
                    k++;
                    j++;
                }else if(a1[i]<a2[j]){  // this will run if element of a1 array if smaller than element of a2 array.
                    result[k]=a1[i];
                    k++;
                    i++;
                }
            }

            if(i != a1.length){
                for(int s=i;s<a1.length;s++){  // this will be exicuted if length of a1 array is greater than length of a2 array.
                    result[k]=a1[s];
                    k++;
                }
            }else{
                for(int t=j;t<a2.length;t++){  // this will be exicuted if length of a1 array is smaller than length of a2 array;
                    result[k]=a2[t];
                    k++;
                }
            }
        }
        // Print the merged array
        printArray(result);
    }
}
