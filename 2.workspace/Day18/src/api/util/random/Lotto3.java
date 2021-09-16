package api.util.random;

import java.util.Arrays;
import java.util.Random;

public class Lotto3 {
	public static void main(String[] args) {
		Random r = new Random();
		int[] win = new int[6];
		
		int i = 0;
		
		while(true) {
			int rn = r.nextInt(6)+1;
			boolean check = true;
			for(int j=0;j<i;j++) {
				if(rn == win[j]) {
					check=false;
					break;
				}
			}
			if(check) {
				win[i] = rn;
				i++;
			}
			
			if(i==6) break;
		}
		
		Arrays.sort(win);
		System.out.println(Arrays.toString(win));
	}//main
}//class
