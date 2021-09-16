package api.util.arrays;

import java.util.Arrays;

public class ArraySearch {
	public static void main(String[] args) {
		int[] scores = {75,47,23,56,89};
		int[] scores2 = Arrays.copyOf(scores,  scores.length);
		
		//배열의 데이터를 오름차순으로 정렬하는 메서드 sort()
		Arrays.sort(scores2);
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(scores2));
		
		//배열내부데이터의 인덱스번호를 탐색하는 메서드 binarySearch()
		int index = Arrays.binarySearch(scores2,  75);
		System.out.println("75가 저장된 인덱스: "+index);
		
		
		
		
		
	}
}
