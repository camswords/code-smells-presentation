package code.smells.understanding.hard;

import java.util.Arrays;


public class AlphabetGame {

	public static void main(String[] args) {
		Parrot polly = new Parrot();
		polly.teach("polly", "want", "a", "cracker?");
		System.out.println(polly.speak());
	}
}