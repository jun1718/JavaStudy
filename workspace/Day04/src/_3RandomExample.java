
public class _3RandomExample {
	public static void main(String[] args) {
		//난수(랜덤값)을 발생시키는 메서드 random()
		//0.0이상 1.0미만의 랜덤 실수값을 가져옴 c에서 rand()는 0~65535개였나? 그랬던듯
		double r = Math.random();
		System.out.println("랜덤값: " + r);
		
		System.out.println("*** 신년 여행지 선정 ! ***");
		if (r >0.66) { //0.67~0.99 33개 이상
			System.out.println("모로코로 갑시다!!!");
		}
		else if(r > 0.33) {//0.34~0.66 33개 
			System.out.println("상하이로 갑시다!!!");
		}
		else{//0~0.32 33개
			System.out.println("집에서 놉시다!!!");
		}
		
		//정수 난수 생성하기 0~9
		int rn = (int)(r*10);
		System.out.println("=============================");
		System.out.println("정수 난수값: " + rn);
		
		System.out.println("*** 신년 여행지 선정 ! ***");
		if (rn >0.66) { //0.67~0.99 33개 이상
			System.out.println("모로코로 갑시다!!!");
		}
		else if(rn > 0.33) {//0.34~0.66 33개 
			System.out.println("상하이로 갑시다!!!");
		}
		else{//0~0.32 33개
			System.out.println("집에서 놉시다!!!");
		}
	}
}
