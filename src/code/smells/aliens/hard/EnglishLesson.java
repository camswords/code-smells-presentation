package code.smells.aliens.hard;

public class EnglishLesson {

	public static void main(String[] args) {
		new EnglishLesson().begin();
	}

	private void begin() {
		Alien alien = new Alien();
		alien.teach("The", "claw", "chooses", "who", "will", "go", "and", "who", "will", "stay.");
		System.out.println(alien.speak());		
	}
}
