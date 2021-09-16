package collection.map;

import java.util.*;

public class Login {
	public static void main(String[] args) {
		Map<String, String> users = new HashMap<>();

		//3명이 회원가입 되어있는상태 아래처럼
		users.put("kim1234", "kkk1234");
		users.put("lee5678", "lll5678");
		users.put("park9876", "ppp9876");



		/*
		 * <로그인 입력값 검증>

		 * 1. 입력받은 아이디가 맵에 입력된 키값에 
		 *    해당하는지의 여부를 검사하여(containsKey 메서드 활용)
		 * 2. 맞다면 다시한번 비밀번호의 값과 비교하여 비밀번호도 일치하면
		 *    "로그인 성공"을 콘솔에 출력하고 반복문을 탈출하세요.
		 * 3. 비밀번호가 다르다면 "비밀번호가 틀렸습니다"를 출력하세요.
		 * 4. 입력받은 아이디가 맵에 입력된 키값이 아니라면 
		 *    "아이디가 존재하지 않습니다"를 출력하세요.
		 */

		Scanner scan = new Scanner(System.in);

		while(true) {

			System.out.print("아이디 입력: ");
			String id = scan.next();

			System.out.println("비밀번호 입력: ");
			String password = scan.next();

			if(users.containsKey(id)) {
				System.out.println("해당 id는 존재합니다.");
			} else {
				System.out.println("해당 id는 존재하지 않습니다.");
				continue;
			}

			if(users.get(id).equals(password)) {
				System.out.println("오 아이디와 비번 일치함! 로그인 성공!");
				System.out.println("로그인 인증 시스템 종료!");
				return;
			}
			System.out.println("에이 아이디는 맞는데 비번 까먹었나봐?");
		}
	}//main
}//class
