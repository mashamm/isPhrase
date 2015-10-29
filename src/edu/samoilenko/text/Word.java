package edu.samoilenko.text;

public class Word {
	private String word;

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;

	}

	public String toString() {
		return word;
	}

	public Word() {
	}

	public Word(String word) {
		setWord(word);
	}

	public static Word[] stringsToWords(String[] str) {
		Word[] w = null;
		if (str != null) {
			w = new Word[str.length];
			for (int i = 0; i < w.length; i++) {
				w[i] = new Word(str[i]);
			}
		}
		return w;
	}

	public int hashCode() {
		return word.hashCode();
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof Word))
			return false;
		Word other = (Word) obj;
		if (!this.word.equalsIgnoreCase(other.word))
			return false;
		return true;
	}
}
