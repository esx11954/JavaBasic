package javaB.parse.exam;

import java.util.regex.Pattern;

class ParseJudge{
	String str;
	
	public ParseJudge(String str){
		this.str = str;
	}
	
	public boolean isNumber() {
    	return Pattern.compile("^[0-9]+$").matcher(this.str).find();
	}
	
	public int getResult(){
		return Integer.parseInt(this.str) * Integer.parseInt(this.str);
	}
}




