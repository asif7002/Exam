package math;

public class LowestNumber {

	public static void main(String[] args) {
		/*
		 * Write java solution to find the lowest number from this array.
		 */
		int  array[] = new int[]{34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};
		
		int temp=0;
		for(int i=0; i<array.length-1; i++)
			for(int j=0; j<array.length-1; j++)
				if(array[j]>array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
		for (int k=0; k<array.length; k++)
			System.out.println(array[k]);
		
		
		
		
	}

}
