package import_ex;
/*
 * 다른 패키지에 있는 클래스를 사용하려면 반드시 package선언부 아래, 그리고 class 선언부위에
 * import 선언을 통해 해당 클래스의 전체경로(패키지명까지 포함된경로)를 적어줘야함
 */

import java.util.Scanner;	//자바패키지 아래에 util패키지아래에 scanner클래스

//import fruit.Apple;
//import fruit.Banana;
import fruit.*;	//fruit 패키지 전체클래스를 import
import hello.bye.Bye;
import hello.hi.Hi;
import fruit.Apple;
import gg.g.ab;


public class ImportExample {
	Apple a = new Apple();
	Banana b = new Banana();
	Test t = new Test();
	Hi h = new Hi();
	Bye y = new Bye();
	
	Scanner scan = new Scanner(System.in);
	String s = new String("방가");
	
	

}
