package week1.day2.classroom.arrays;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int len =arr.length;
		// get the length of the array
		
		// declare an int variable named count
			int count=0;
		
		// iterate from 0 to the array length (outer loop starts here)
		for(int i=0;i<len;i++)
			// assign 0 to count 
		{
			// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
			for (int j=i+1;j<len;j++)
					// compare both the loop variables & check they're equal
			{
				if(arr[i]==arr[j]) {
					count+=1;
					System.out.println(arr[j]);
				}
			}
		}
			System.out.println("Count = "+ count);
							// increase the count if both the arrays are equal
					
			// Out of the inner loop, check and print the first array variable if count is more than 0
		
	}
}

