package api.util.random;

import java.util.Random;
import java.util.Arrays;

public class Lotto2 {
	public static void main(String[] args) {
		int[] arr = new int[6];
				
		Random r = new Random();
		int num;
		
		for(int i=0;i<6;i++) {
			while(true) {
				int j=0;
				num = r.nextInt(45)+1;
				while(j<6) {
					if(num==arr[j]) break;
					j++;
				}
				if(j==6) {
					arr[i] = num;
					break;
				}//if
			}//while
		}//for
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}//main
}//class
