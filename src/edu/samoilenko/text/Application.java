package edu.samoilenko.text;

public class Application {

	public static void main(String[] args) {
		Text t = new Text();
		t.setText("\"You don't mean — you can't mean the people who live here?\""
				+ " cried Professor McGonagall, jumping to her feet and pointing at number four. "
				+ "\"Dumbledore — you can't. I've been watching them all day."
				+ " You couldn't find two people who are less like us. "
				+ "And they've got this son — I saw him kicking his mother all the way up the street,"
				+ " screaming for sweets. " + "Harry Potter come and live here!\"" + "\"Hello Masha\"");
		PhraseMatcher matcher = new PhraseMatcher();
		matcher.setText(t);
		matcher.setW(new Word("dumbledore"));
		matcher.start();

	}

}
