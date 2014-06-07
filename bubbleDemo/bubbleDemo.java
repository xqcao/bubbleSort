package bubbleDemo;

import java.util.Arrays;

public class bubbleDemo {

	public static void main(String args[]){
		int[] abc = {12,32,11,-15,27,33,22,19,28};
		int[] aaa = Arrays.copyOf(abc, abc.length);
		//SORT(aaa);
		SORT2(aaa);
		System.out.println(Arrays.toString(abc));
		System.out.println(Arrays.toString(aaa));
	}
	public static void SORT(int[] arr){
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr.length; j++) {
				int temp;
				if(arr[i] < arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] =temp;
				}
			}
		}		
	}
	public static void SORT2(int[] arr) {
		int i = 0;
		int temp;
		while (i<arr.length-1) {
			
			if(arr[i]>arr[i+1]){
				temp = arr[i+1];
				arr[i+1] = arr[i];
				arr[i] = temp;
				i=0;
			} else {
				i++;
			}
		}
	}
}
