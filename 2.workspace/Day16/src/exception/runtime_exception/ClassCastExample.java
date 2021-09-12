package exception.runtime_exception;

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class ClassCastExample {
	public static void main(String[] args) {
		Dog d = new Dog();
		Animal da = d;
		d = (Dog)da;
		System.out.println("타입변환 성공!");
		
		Animal c = new Cat();
	//	Cat c = new Cat();
//		Dog d2 = (Dog)c; 이건 컴파일에러가 잡아냄
		Dog d2 = (Dog)c;	//이건 컴파일에러가 안잡힘 animal이라는 동일부모 공통점이있어서
							//그런건가? 한번 업캐스팅이 된녀석을
							//다운캐스팅하는거니까 업캐스팅된게 Dog였는줄아는건가
						//Cat c를 하면 upcasting이 안일어났는데 downcasting
		//하려고해서 컴파일이 이건 잡는거고 두번째는 up후 down이고 부모가 같아서 그거까진
		//못잡아내나봄 컴파일이?
		System.out.println("타입변환");
		
	}
}