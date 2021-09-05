
public class PenMain {
	public static void main(String[] args) {
		//Pen의 기능과 속성을 사용하려면 설계용 클래스를 로딩시켜 pen 객체를 생성해야함
		Pen blackPen = new Pen();
		blackPen.color = "검정";
		blackPen.price = 400;
		
		blackPen.write();
		blackPen.info();
		
		Pen redPen = new Pen();
		redPen.color = "빨강";
		redPen.price = 600;
		redPen.write();
		redPen.info();
		
		
		System.out.println(blackPen);
		System.out.println(redPen);
				
		
		Pen bluePen = new Pen();
		bluePen.color = "파랑";
		bluePen.price = 500;
		
		bluePen.write();
		bluePen.info();
		
	
	}

}
