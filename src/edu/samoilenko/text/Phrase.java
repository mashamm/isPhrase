package edu.samoilenko.text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Phrase {
	private Word[] phrase;

	public Phrase() {
	}

	public Phrase(Word[] phrase) {
		this.phrase = phrase;
	}

	public String toString() {
		return phrase.toString();
	}

	public boolean findWordInPhrase(Word w) {
		return Arrays.asList(phrase).stream().anyMatch(s -> s.equals(w));
	}

	public int hasCode() {
		return Arrays.hashCode(phrase);
	}
}
