package edu.samoilenko.text;

public class Text {
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String string) {
		this.text = string;
	}

	public Text() {
	}

	public Text(String str) {
		setText(str);
	}

	public int hashCode() {
		return text.hashCode();
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof Text))
			return false;
		Text other = (Text) obj;
		if (!this.text.equalsIgnoreCase(other.text))
			return false;
		return true;

	}

}
