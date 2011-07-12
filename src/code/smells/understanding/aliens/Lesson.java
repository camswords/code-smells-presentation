package code.smells.understanding.aliens;

public class Lesson {

	public static void main(String[] args) {
		Alien alien = new Alien();
		alien.teach("The", "claw", "is", "our", "master!");
		System.out.println(alien.speak());
	}
}
