import java.util.Arrays;

public class _6ArrayBasic {
	public static void main(String[] args) {
		//1.배열의 선언 -stack에 배열의 참조변수를 설정
//		int score[50];//자바에서는 선언시 크기명시 불가
//		int score[];	//c style
		int[] score;    //java style
				//현재는 힙에 할당안됨 score에는 null 값이 들어가있음
//		System.out.println(score); //에러
		
		
		
		//2.배열의 생성 -heap에 실제 데이터가 저장될 공간을 생성
		//배열은 생성시 크기를 명시함. 한번 설정한 크기는 변경불가
		score = new int[5];
		System.out.println(score);
		System.out.println(score[0]);	//기본값으로 초기화됨
		
		//3.배열의 초기화 - 배열에 값을 저장하는 과정
		score[0] = 87;
		System.out.println(score[0]);	//배열의 초기화
			
		score[2] = 99;
		score[3] = score[0];
		
		
		//4.배열의 값 참조(사용)
		System.out.println("배열의 3번째 데이터값 : " + score[2]);
		System.out.println("배열의 4번째 데이터값 : " + score[3]);
		
		/*
		 * 배열 내부에 저장된 값들을 한눈에 문자열 형태로 확인해보려면 출력메서드 
		 * println의 매개값으로 Arrays.toString(배열변수명)을 쓰면 됨
		 */
		System.out.println(Arrays.toString(score));
		
		
		//배열의 길이를 알아보려면 배열변수명.length 명령을 사용
		System.out.println("배열의 길이: " + score.length);
		
		//배열의 선언과 생성을 동시에 하는방법
		byte[] bArr = new byte[7];
		System.out.println(Arrays.toString(bArr));
		
		//배열의  선언과 생성과 초기화를 동시하는 방법
		char[] letters = new char[] {'가', '나', '다', '라'};
		System.out.println(Arrays.toString(letters));
		System.out.println("배열의 길이: " + letters.length);
		
//		String[] names = new String[] {"홍길동", "심사임당", "강감찬"};
		String[] names = {"홍길동", "심사임당", "강감찬"}; // 선언-생성-초기화를 동시에
											//하는경우에는 new 배열타입[] 생략가능
		System.out.println(names);
		System.out.println(Arrays.toString(names));
		System.out.println("배열의 길이: " + names.length);
		
		//배열의 초기값을 설정하지 않으면 각 데이터 타입의 기본값으로 자동초기화됨
		
		
	}
}
