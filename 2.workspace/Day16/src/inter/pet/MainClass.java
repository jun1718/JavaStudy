package inter.pet;

public class MainClass {

	public static void main(String[] args) {
		Dog baduk = new Dog();
		Animal nabi = new Cat(); //여기는 상관없지만 아래 pets[1]에서 에러남
			/*
			 * animal과 ipet은 상관이 없기때문에 아래에서 ipet이 animal부분을 담을수없음
			 * 애초에  nabi가 Cat으로 만들어지면 interface의 상수와 메소드부분을 가지고,
			 * 부모의 멤버와 생성자를 가진다. 그러다가 다형성으로 Cat이 Animal이 되면
			 * Animal클래스가 가진 멤버와 생성자밖에 못쓰고 Cat의 고유한 멤버는 사용할수없다.
			 * 이는 interface도 마찬가지다. 
			 */
		//위에 Animal nabi했을때 아래에서 에러안나게하려면 강제형변환해주면됨
		
		//Cat nabi = new Cat();
		
		Tiger hodol = new Tiger();
		
		Animal[] animals = {baduk, nabi, hodol};
		
		for(Animal a : animals) {
			a.eat();
		}
		System.out.println("---------------------------");
		IPet[] pets = new IPet[3];
		
		pets[0] = baduk;
//		pets[1] = nabi;
//		pets[1] = (Cat)nabi;
		pets[1] = (IPet)nabi;
		
		
//		pets[2] = hodol; //Tiger 클래스는 interpace로 IPet을 상속받지 않았다.그래서
			//다형성불가
//		pets[2] = (IPet)hodol;	//컴파일에러는 안뜨지만 런타임에러가 뜸
						//hodol이는 interpace가 구현되지 않았기 때문임
		
		//pets[2] = new Shark();
		
		pets[2] = new GoldFish();
		
		for(IPet pet: pets) {
			pet.play();
		}
		
		System.out.println("--------------------------");
		
		PetShop shop = new PetShop();
		shop.carePet(baduk);
		System.out.println("--------------------------");
		shop.carePet((IPet)nabi);
		shop.carePet(pets[2]);
	}

}
