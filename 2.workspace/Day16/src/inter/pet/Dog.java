package inter.pet;

public class Dog extends Animal implements IPet {
	
	public void play() {
		System.out.println("강아지는 밖에서 놀아요~");
	}
	public void eat() {
		System.out.println("강아지는 사료를 먹어요~");		
	}
	

}
