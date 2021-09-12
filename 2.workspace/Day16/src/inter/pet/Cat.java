package inter.pet;

public class Cat extends Animal implements IPet {

	public void play() {
		System.out.println("고양이는 방에서 놀아요~");
	}
	public void eat() {
		System.out.println("고양이는 생선을 먹어요~");
	}

}
