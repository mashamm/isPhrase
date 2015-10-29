package edu.samoilenko.text;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static edu.samoilenko.text.Word.stringsToWords;

public class PhraseMatcher {
	private List<Phrase> list;
	private Text text;
	private Word w;
	
	public List<Phrase> getList() {
		return list;
	}
	public void setList(List<Phrase> list) {
		this.list = list;
	}
	public Text getText() {
		return text;
	}
	public void setText(Text text) {
		this.text = text;
	}
	public Word getW() {
		return w;
	}
	public void setW(Word w) {
		this.w = w;
	}
	public PhraseMatcher(){
		list =new ArrayList<>();
	}
	public PhraseMatcher(Text text,Word w){
		this.text=text;
		this.w=w;
	}
	private boolean isPhrase(){
		if(text!=null&&list.isEmpty()){
			splitOnPhrase();
				if(list.stream().filter(ph->ph.findWordInPhrase(w)).
				collect(Collectors.toList()).size()!=0)
					return true;
		 return false;}
		else throw new IllegalArgumentException("Invalid args");
		}
	
	private void splitOnPhrase() {
		String delim = "(\"(.*?)\")";
		Pattern p = Pattern.compile(delim);
		Matcher m = p.matcher(text.getText());
		int end=0;
			while (m.find(end)) {
				list.add(new Phrase(stringsToWords(m.group(0).replaceAll("[\",.,!,?]","").split("\\s+"))));
				//System.out.println("group="+m.group(0));
				 end = m.end();
				if (m.hitEnd() != true) {
					m.reset();
					m.find(end);
				} else
					break;
			}
			
		}
	public void start(){
		
		System.out.println(isPhrase());
	}

}
