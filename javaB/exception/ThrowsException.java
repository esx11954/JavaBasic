package javaB.exception;

class ThrowsException{
	
	public void parse(String i) throws Exception{
		
		// 数値以外を受け取るとNumberFormatExceptionが発生
		System.out.println("引数を " + Integer.parseInt(i) + " に数値変換しました");
	}
}