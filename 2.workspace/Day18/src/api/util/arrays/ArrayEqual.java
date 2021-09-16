package api.util.arrays;

import java.util.Arrays;

public class ArrayEqual {
	public static void main(String[] args) {
		//배열비교 equals(배열1, 배열2)
		int[] arr1 = {1,3,5,7,9,10};
		int[] arr2 = {1,3,5,7,9};
		
//		if(arr1 == arr2) {
//			System.out.println("배열의 각 항목이 일치함");
//		} else {
//			System.out.println("배열의 각 항목중 다른것이 있거나 모두 다름");
//		}
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("배열의 각 항목이 일치함");
		} else {
			System.out.println("배열의 각 항목중 다른것이 있거나 모두 다름");
		}
	}
}
