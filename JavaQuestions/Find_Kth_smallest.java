package JavaQuestions;
public class Find_Kth_smallest {
public static void main(String[] args) {
    int [] arr={3,6,7,1,9,5};
    int k=2;
    int check=0;
    for(int i=0;i<arr.length;i++){
        int small=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[small]>arr[j]){
                small=j;
            }
        }
        check++;
        if(check==k){
            System.out.println(arr[small]);
            return;
        }
        int swap=arr[small];
        arr[small]=arr[i];
        arr[i]=swap;
    }
}

}
