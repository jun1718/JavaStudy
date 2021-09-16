package api.util.arrays;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		char[] arr1 = {'J', 'A', 'V', 'A'};
//		char[] arr2 = arr1;
//		
//		char[] arr3 = new char[4];
//		arr3[0] = arr1[0];
//		arr3[1] = arr1[1];
//		arr3[2] = arr1[2];
//		arr3[3] = arr1[3];
//		
//		
//		System.out.println(Arrays.toString(arr1));
//		System.out.println(Arrays.toString(arr2));
//		System.out.println(Arrays.toString(arr3));
//		
//		arr1[0] = 'B';
//
//		System.out.println(Arrays.toString(arr1));
//		System.out.println(Arrays.toString(arr2));
//		System.out.println(Arrays.toString(arr3));
		//copyof: 0번인덱스부터 해당하는 인덱스까지(미만아님) 복사하라
		char[] arr2 = Arrays.copyOf(arr1,  arr1.length);
		//char[] arr2 = Arrays.copyOf(arr1,  5);
		//char[] arr2 = Arrays.copyOf(arr1,  7); 이러면 공간을 더 만들고 널값초기화
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		arr1[0] = 'D';
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));	//깊은복사가 완료됨의 증거
		
		//copyOfRange: 첫인덱스이상 둘인덱스 미만까지를 카피하라
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println(Arrays.toString(arr3));
		
		int[] arr4 = {10,20,30,40,50,60,70,80};
		//20~60까지 카피
		int[] arr5 = Arrays.copyOfRange(arr4, 1,6);
		
		System.out.println(Arrays.toString(arr5));
		
	}
}
