class Count_number_of_Digits_in_Number
{
	public static void main(String[] args) {
	
	
	
	
	
	// Count number of Digits in a Number.

int n=1234485834;

int count=0;

while(n>0){
    n=n/10;
    count++;
}
System.out.println(count);
	
	
	
	
	
	}
}