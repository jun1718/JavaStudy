package exception.runtime_exception;

public class ArrayIndexExample {

	public static void main(String[] args) {
		int[] arr = {3, 6, 9};
		System.out.println(arr[2]);
//		System.out.println(arr[3]); //분명 없는 인덱스를 []에 넣었는데도 checked
			//exception이 발생안함. 즉 컴파일에러가 안뜸 근데 이건 돌리면에러가남
		//이게바로 runtime error이면서 unchecked exception
	}

}
