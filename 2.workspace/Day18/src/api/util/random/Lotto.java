package api.util.random;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
	public static void main(String[] args) {
		Random r = new Random();
		
		int[] arr = new int[6];
//		System.out.println(num);
		
		
		int num =0;
		int count=0;
		
		while(true) {
			while(true) {				
				int j=0;
				num = r.nextInt(45)+1;
				while(j<6) {
					if(num == arr[j]) {
						break;
					}
					j++;
				}
				
				if(j==6) {
					count++;
					arr[count-1] = num;
					break;
				}
			}
			
			if(count==6) break;
		}
		
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
	}//main
}//class
