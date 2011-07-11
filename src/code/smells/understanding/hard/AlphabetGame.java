package code.smells.understanding.hard;

import java.util.Arrays;


public class AlphabetGame {

	public static void main(String[] args) {
		Parrot polly = new Parrot();
		polly.teach("polly", "want", "a", "cracker?");
		System.out.println(polly.speak());
	}
}

class Parrot extends Bird {
	
	private String vocabularyA;
	private String vocabularyB;
	
	public Parrot() {
		super("rraaarrrk");
		speak();
	}
	
	public String speak() {
		return super.speak();
	}
}

class Bird extends Animal {
	
	private String[] vocabulary;
	
	public Bird(String birdVocabulary) {
		super();
		teach(birdVocabulary);
	}
	
	public String speak() {
		if (vocabulary.length >= 3) {
			teach(vocabulary[2]);
		}
		return super.speak() + StringUtils.join();
	}

	public void teach(String ... words) {
		speak();
	}
}

class Animal {
	
	private String vocabularly;
	
	public Animal() {
		vocabularly = "";
	}
	
	public String speak() {
		return "";
	}

	public void teach(String ... words) {
		if (words.length > 1) {
			this.vocabularly = words[0];
		}
	}
}
