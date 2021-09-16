package api.util.random;

import java.util.Random;
import java.util.Arrays;

public class Lotto4 {
	
	
	public static int randomNumber() {
		Random r = new Random();
		int num = r.nextInt(45)+1;
		
		return num;
	}
	
	
	public static int[] createLotto() {
		int[] lotto = new int[6];
		int count = 0;
	
		while(true) {
			int num = randomNumber();
			boolean check = true;
			for(int i=0;i<count;i++) {				
				if(num==lotto[i]) {
					check = false; 
					break;
				}
			}
			if(check) {
				lotto[count] = num;
				count++;
			}
			
			if(count==6) break;
		}
		
		Arrays.sort(lotto);
		
		return lotto;
	}
	
	
	public static boolean bonusCheck(int[] myLotto, int bonusNumber) {		
		for(int j=0;j<myLotto.length;j++) {				
			if(myLotto[j] == bonusNumber) {
				System.out.println("보너스게임은 승리하셨네요! 과연 5개를 맞추셨을까요?\n맞추셨다면 2등! 못맞췄다면 무쓸모!");
				return true;
			}
		}
		System.out.println("보너스게임 실패하셨네요!");
		return false;
	}
	
	
	public static boolean bonusGame(int[] myLotto, int[] win) {
		System.out.println("\n*****!!보너스게임 시작!!*****");
		int i=0;
		int bonusNumber;
		
		while(true) {
			bonusNumber = randomNumber();
			while(i<win.length && bonusNumber != win[i]) {
				i++;
			}
			if(i==6) break;
		}			
		
		System.out.println("bonus number : "+bonusNumber);
		return bonusCheck(myLotto, bonusNumber);
	}
	
	public static int firstCheck(int[] myLotto, int[] win) {			
		int count = 0;
		
		for(int i=0;i<myLotto.length;i++) {
			for(int j=0;j<win.length;j++) {
				if(myLotto[i]==win[j]) count++;
			}
		}
		
		return count;
	}

	
	public static void disp(int count, boolean bonusGameResult) {
		System.out.println("\n<결과 발표! 두구두구두구~~!!!>");
		System.out.println("\n맞춘갯수 : "+count+"개");
		if(count==6) {
			System.out.println("당첨 1등입니다! 100억원");
			return;
		}
		if(count==5 && bonusGameResult) {
			System.out.println("2등입니다. 20억원");
			return;
		}
		if(count==5) {
			System.out.println("3등입니다. 1억원");
			return;
		}
		if(count==4) {
			System.out.println("4등입니다. 1천만원");
			return;
		}
		if(count==3) {
			System.out.println("5등입니다. 5천원");
			return;
		}	
		if(count<=2) {
			System.out.println("꽝! 그냥 꽝! 역전은 무슨! 꽝!!!");
			return;
		}
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("가슴이~~ 두근두근!! 로또 자동입력 시작!");
		int[] myLotto = createLotto();
		System.out.println("\n고객님의 로또번호 자동입력이 완료되었습니다.");
		System.out.println("고객님의  인생역전 번호 : "+ Arrays.toString(myLotto));
		
		
		System.out.println("\n이번주 로또번호 추첨시작!");
		int[] win = createLotto();
		System.out.println("이번주 로또번호 결과 : "+Arrays.toString(win));

		
		//System.out.println(myLotto.equals(win)); // 이게 true면 당첨임
		
		int count = firstCheck(myLotto, win);
		boolean bonusGameResult = bonusGame(myLotto, win);
		disp(count, bonusGameResult);		
		
	}//main
}//class
