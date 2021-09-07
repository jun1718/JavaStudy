package inherit.phone;

public class DmbPhone extends Phone{
	 int channel;
	
	 DmbPhone(String mod, String col, int ch){
		 model = mod;
		 color = col;
		 channel = ch;
	 }
	
	void turnOnDmb() {
		System.out.println("방송 수신을 시작합니다.");
	}
	void turnOffDmb() {
		System.out.println("방송 수신을 종료합니다.");
	}
	void changeChannel(int n) {
		channel = n;
		System.out.printf("채널  %d번으로 변경합니다.\n", channel);
	}

}
